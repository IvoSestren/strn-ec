package br.com.strn.ec.util.environment;

import br.com.caelum.vraptor.environment.DefaultEnvironment;
import com.google.common.base.Strings;
import org.slf4j.Logger;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Specializes;
import javax.inject.Inject;
import javax.servlet.ServletContext;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

@Specializes
public class StrnEnvironment extends DefaultEnvironment {

    private static final String PARAM_NAME = "STRN.EC.DIR";
    private final Logger logger;

    private Properties properties;

    /**
     * @deprecated CDI eyes only
     */
    protected StrnEnvironment() {
        this(null, null);
    }

    @Inject
    public StrnEnvironment(ServletContext context, Logger logger) {
        super(context);
        this.logger = logger;
    }

    @PostConstruct
    protected void init() {
        this.loadProperties();
    }

    @Override
    public boolean has(String key) {
        if (properties.containsKey(key))
            return true;

        return super.has(key);
    }

    @Override
    public String get(String key) {
        if (properties.containsKey(key))
            return properties.getProperty(key);

        return super.get(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        if (properties.containsKey(key))
            return properties.getProperty(key);

        return super.get(key, defaultValue);
    }

    @Override
    public Iterable<String> getKeys() {
        Set<String> res = properties.stringPropertyNames();

        res.addAll((Collection<? extends String>) super.getKeys());

        return res;
    }

    private void loadProperties() {
        properties = new Properties();

        loadAndPut(BASE_ENVIRONMENT_FILE, properties);
        loadAndPut(this.getName(), properties);
    }

    private void loadAndPut(String environment, Properties properties) {
        String path;
        File file;

        path = Strings.nullToEmpty(System.getProperty(PARAM_NAME)) + File.separator + environment + ".properties";
        file = new File(path);
        if (file.exists()) {
            load(properties, file);
        } else {
            path = Strings.nullToEmpty(System.getenv(PARAM_NAME)) + File.separator + environment + ".properties";
            file = new File(path);
            if (file.exists()) {
                load(properties, file);
            }
        }
    }

    private void load(Properties properties, File arquivo) {
        Properties prop = new Properties();

        try (InputStream istream = new FileInputStream(arquivo)) {
            prop.load(istream);
            properties.putAll(prop);
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
    }
}
