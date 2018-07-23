package br.com.strn.ec.util.thymeleaf;

import br.com.caelum.vraptor.environment.Environment;
import br.com.strn.ec.database.entities.client.Theme;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.extras.java8time.dialect.Java8TimeDialect;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.AbstractConfigurableTemplateResolver;
import org.thymeleaf.templateresolver.FileTemplateResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.servlet.ServletContext;
import java.time.LocalDateTime;
import java.util.concurrent.ConcurrentHashMap;

@ApplicationScoped
public class TemplateEngineFactory {

    private static final String ID_THEME_DEFAULT = "005IPGTWLGR33-1GJVDB7XTQWYE.0ZBADBW0K7T2X";

    private ConcurrentHashMap<String, TemplateEngine> engines;
    private ConcurrentHashMap<String, LocalDateTime> timeHit;
    private LocalDateTime nextTryPurge;

    public TemplateEngineFactory() {
    }

    @PostConstruct
    public void initialize() {
        this.engines = new ConcurrentHashMap<>();
        this.timeHit = new ConcurrentHashMap<>();
        nextTryPurge = LocalDateTime.now().plusHours(2);
    }

    TemplateEngine getInstance(ServletContext context, Theme theme, Environment env) {
        TemplateEngine engine = getEngineFromCache(theme);

        tryPurgeCache();

        if (engine != null)
            return engine;

        engine = createEngine(context, theme, env);

        addEngineToCache(theme, engine);

        return engine;
    }

    private void tryPurgeCache() {
        LocalDateTime agora = LocalDateTime.now();
        if (agora.isAfter(nextTryPurge)) {
            purgeCache();
        }
    }

    private void purgeCache() {
        LocalDateTime agora = LocalDateTime.now();

        String idOld = null;

        for (String id : timeHit.keySet()) {
            if (agora.isAfter(timeHit.get(id))) {
                idOld = id;
                break;
            }
        }

        if (idOld != null)
            timeHit.remove(idOld);
    }

    private TemplateEngine getEngineFromCache(Theme theme) {
        String id = null;
        try {
            id = theme.getId();
        } catch (RuntimeException re) {
            id = ID_THEME_DEFAULT;
        }

        TemplateEngine engine = engines.get(id);
        if (engine != null)
            hitEngine(id);
        return engine;
    }

    private void hitEngine(String id) {
        if (timeHit.containsKey(id)) {
            timeHit.replace(id, LocalDateTime.now().plusHours(2));
        } else {
            timeHit.put(id, LocalDateTime.now().plusHours(2));
        }
    }

    private void addEngineToCache(Theme theme, TemplateEngine engine) {
        engines.put(theme.getId(), engine);
        hitEngine(theme.getId());
    }

    private TemplateEngine createEngine(ServletContext context, Theme theme, Environment env) {
        Java8TimeDialect j8 = new Java8TimeDialect();

        TemplateEngine engine = new TemplateEngine();

        try {
            engine.getTemplateResolvers().clear();
        } catch (UnsupportedOperationException ignored) {
        }

        if (!theme.getId().equals(ID_THEME_DEFAULT)) {
            // Add another theme when is diferent to default theme
            addCustomTemplateResolver(engine, context, theme, env);
        }

        // Always add default theme
        addDefaultTemplateResolver(engine, context, env);

        engine.addDialect(j8);

        return engine;
    }

    private void addDefaultTemplateResolver(TemplateEngine engine, ServletContext context, Environment env) {
        engine.addTemplateResolver(getDefaultHtmlTemplateResolver(context, env));
    }

    private void addCustomTemplateResolver(TemplateEngine engine, ServletContext context, Theme theme, Environment env) {
        engine.addTemplateResolver(getCustomHtmlTemplateResolver(context, theme, env));
    }

    private ITemplateResolver getCustomHtmlTemplateResolver(ServletContext context, Theme theme, Environment env) {
        AbstractConfigurableTemplateResolver resolver;

        Boolean cacheable = "PRODUCTION".equals(env.getName());

        if (theme.getInternal()) {
            resolver = new ServletContextTemplateResolver(context);
        } else {
            resolver = new FileTemplateResolver();
        }

        resolver.setTemplateMode(TemplateMode.HTML);
        resolver.setPrefix(theme.getLocation());
        resolver.setSuffix("");
        resolver.setCacheTTLMs(3600000L);
        resolver.setCacheable(cacheable);

        return resolver;
    }

    private ITemplateResolver getDefaultHtmlTemplateResolver(ServletContext context, Environment env) {
        Boolean cacheable = "PRODUCTION".equals(env.getName());

        ServletContextTemplateResolver resolver = new ServletContextTemplateResolver(context);
        resolver.setTemplateMode(TemplateMode.HTML);
        resolver.setPrefix("/WEB-INF/templates/default/");
        resolver.setSuffix("");
        resolver.setCacheTTLMs(3600000L);
        resolver.setCacheable(cacheable);

        return resolver;
    }

}
