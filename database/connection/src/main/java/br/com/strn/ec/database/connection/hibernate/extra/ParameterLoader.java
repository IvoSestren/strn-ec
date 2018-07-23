package br.com.strn.ec.database.connection.hibernate.extra;

import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.controller.ControllerMethod;
import br.com.caelum.vraptor.converter.Converter;
import br.com.caelum.vraptor.core.Converters;
import br.com.caelum.vraptor.events.ControllerFound;
import br.com.caelum.vraptor.http.Parameter;
import br.com.caelum.vraptor.http.ParameterNameProvider;
import br.com.caelum.vraptor.view.FlashScope;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import org.hibernate.Session;
import org.hibernate.type.Type;

import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.lang.annotation.Annotation;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Predicates.instanceOf;
import static com.google.common.collect.Iterables.any;
import static com.google.common.collect.Iterables.isEmpty;
import static java.util.Arrays.asList;

public class ParameterLoader {

    private final Session session;
    private final HttpServletRequest request;
    private final ParameterNameProvider provider;
    private final Result result;
    private final Converters converters;
    private final FlashScope flash;

    /**
     * @deprecated CDI eyes only.
     */
    protected ParameterLoader() {
        this(null, null, null, null, null, null);
    }

    @Inject
    public ParameterLoader(Session session, HttpServletRequest request, ParameterNameProvider provider, Result result,
                           Converters converters, FlashScope flash) {
        this.session = session;
        this.request = request;
        this.provider = provider;
        this.result = result;
        this.converters = converters;
        this.flash = flash;
    }

    @SuppressWarnings("StaticPseudoFunctionalStyleMethod")
    public boolean containsLoadAnnotation(ControllerMethod method) {
        return any(asList(method.getMethod().getParameterAnnotations()), hasAnnotation(Load.class));
    }

    public void load(@Observes ControllerFound event) {
        ControllerMethod method = event.getMethod();

        if (containsLoadAnnotation(method)) {
            Annotation[][] annotations = method.getMethod().getParameterAnnotations();

            final Parameter[] parameters = provider.parametersFor(method.getMethod());
            final Class<?>[] types = method.getMethod().getParameterTypes();
            final Object[] args = flash.consumeParameters(method);

            for (int i = 0; i < parameters.length; i++) {
                if (hasLoadAnnotation(annotations[i])) {
                    String name = parameters[i].getName();
                    Object loaded = load(name, types[i]);

                    // TODO extract to method, so users can override behavior
                    if (loaded == null) {
                        result.notFound();
                        return;
                    }

                    if (args != null) {
                        args[i] = loaded;
                    } else {
                        request.setAttribute(name, loaded);
                    }
                }
            }

            flash.includeParameters(method, args);
        }
    }

    @SuppressWarnings({"unchecked", "rawtypes", "deprecation"})
    private Object load(String name, Class type) {
        String idProperty = session.getSessionFactory().getClassMetadata(type).getIdentifierPropertyName();
        checkArgument(idProperty != null, "Entity %s must have an id property for @Load.", type.getSimpleName());

        String parameter = request.getParameter(name + "." + idProperty);
        if (parameter == null) {
            return null;
        }

        Type idType = session.getSessionFactory().getClassMetadata(type).getIdentifierType();
        Converter<?> converter = converters.to(idType.getReturnedClass());
        checkArgument(converter != null, "Entity %s id type %s must have a converter", type.getSimpleName(), idType);

        Serializable id = (Serializable) converter.convert(parameter, type);
        return session.get(type, id);
    }

    @SuppressWarnings("StaticPseudoFunctionalStyleMethod")
    private boolean hasLoadAnnotation(Annotation[] annotations) {
        return !isEmpty(Iterables.filter(asList(annotations), Load.class));
    }

    @SuppressWarnings({"Guava", "SameParameterValue", "StaticPseudoFunctionalStyleMethod", "ConstantConditions"})
    private Predicate<? super Annotation[]> hasAnnotation(final Class<?> annotation) {
        return (Predicate<Annotation[]>) param -> any(asList(param), instanceOf(annotation));
    }
}
