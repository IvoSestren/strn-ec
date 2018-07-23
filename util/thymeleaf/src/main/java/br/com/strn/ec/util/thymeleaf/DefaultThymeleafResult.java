package br.com.strn.ec.util.thymeleaf;

import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.controller.ControllerMethod;
import br.com.caelum.vraptor.environment.Environment;
import br.com.caelum.vraptor.http.MutableRequest;
import br.com.caelum.vraptor.http.MutableResponse;
import br.com.caelum.vraptor.validator.Validator;
import br.com.caelum.vraptor.view.ResultException;
import br.com.strn.ec.database.entities.client.Theme;
import org.slf4j.Logger;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.servlet.ServletContext;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DefaultThymeleafResult implements ThymeleafResult {

    private final ControllerMethod method;
    private final MutableResponse response;
    private final Logger logger;
    private final Validator validator;
    private final MutableRequest request;
    private final ServletContext context;
    private final Result result;
    private final TemplateEngineFactory engineFactory;
    private final Theme theme;
    private final Environment env;

    private Map<String, Object> variables;
    private String templateFile;

    /**
     * @deprecated CDI eyes only
     */
    protected DefaultThymeleafResult() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    @Inject
    public DefaultThymeleafResult(ControllerMethod method, MutableResponse response, Logger logger, Validator validator,
                                  MutableRequest request, ServletContext context, Result result,
                                  TemplateEngineFactory engineFactory, Theme theme, Environment env) {
        this.method = method;
        this.response = response;
        this.logger = logger;
        this.validator = validator;
        this.request = request;
        this.context = context;
        this.result = result;
        this.engineFactory = engineFactory;
        this.theme = theme;
        this.env = env;
    }

    @PostConstruct
    protected void construct() {
        this.variables = new HashMap<>();
    }

    @Override
    public void sendError(int statusCode) {
        try {
            response.sendError(statusCode);
        } catch (IOException e) {
            throw new ResultException("Error while setting status code", e);
        }
    }

    @Override
    public void sendError(int statusCode, String message) {
        try {
            response.sendError(statusCode, message);
        } catch (IOException e) {
            throw new ResultException("Error while setting status code", e);
        }
    }

    @Override
    public void setStatusCode(int statusCode) {
        response.setStatus(statusCode);
    }

    @Override
    public ThymeleafResult addHeader(String name, String value) {
        response.addHeader(name, value);
        return this;
    }

    @Override
    public ThymeleafResult addIntHeader(String name, int value) {
        response.addIntHeader(name, value);
        return this;
    }

    @Override
    public ThymeleafResult addDateHeader(String name, long date) {
        response.addDateHeader(name, date);
        return this;
    }

    @SuppressWarnings("unchecked")
    @Override
    public ThymeleafResult addVariables(Map map) {
        this.variables.putAll(map);
        return this;
    }

    @SuppressWarnings("unchecked")
    @Override
    public ThymeleafResult addVariable(String chave, Object valor) {
        this.variables.put(chave, valor);
        return this;
    }

    @Override
    public ThymeleafResult templateFile(String arquivo) {
        this.templateFile = arquivo;
        return this;
    }

    @Override
    public ThymeleafResult render() {
        try {
            TemplateEngine engine = process();

            engine.process(getTemplateFile(), ctx(), response.getWriter());
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new ResultException("Couldn't write to response body", e);
        }

        return this;
    }

    @Override
    public String generate() {
        try {
            TemplateEngine engine = process();

            return engine.process(getTemplateFile(), ctx());
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new ResultException("Couldn't write to response body", e);
        }
    }

    private TemplateEngine process() {
        addValidator();

        variables.putAll(result.included());

        // TODO: pegar o theme do token
        return engineFactory.getInstance(context, theme, env);
    }

    private WebContext ctx() {
        WebContext ctx = new WebContext(request, response, context, request.getLocale());
        ctx.setVariables(variables);

        return ctx;
    }

    private void addValidator() {
        if (validator.getErrors().size() > 0)
            this.addVariable("validator", validator);
    }

    private String getTemplateFile() {
        if (this.templateFile != null) {
            logger.debug("Template ja definido: " + this.templateFile);
            return this.templateFile;
        }

        String controller = method.getController().getType().getSimpleName();
        String _method = method.getMethod().getName();

        if (controller.endsWith("Controller"))
            controller = controller.substring(0, controller.length() - 10);

        controller = controller.substring(0, 1).toLowerCase() + controller.substring(1, controller.length());

        String arq = controller + "/" + _method;

        logger.debug("Template: " + arq);

        return arq;
    }
}
