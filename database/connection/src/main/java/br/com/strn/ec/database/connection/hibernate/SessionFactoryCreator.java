package br.com.strn.ec.database.connection.hibernate;

import br.com.caelum.vraptor.proxy.CDIProxies;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.slf4j.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

public class SessionFactoryCreator {

    private final Configuration cfg;
    private final ServiceRegistry serviceRegistry;
    private final Logger logger;

    /**
     * @deprecated CDI eyes only.
     */
    protected SessionFactoryCreator() {
        this(null, null, null);
    }

    @Inject
    public SessionFactoryCreator(Configuration cfg, ServiceRegistry serviceRegistry, Logger logger) {
        this.cfg = cfg;
        this.serviceRegistry = serviceRegistry;
        this.logger = logger;
    }

    @Produces
    @ApplicationScoped
    public SessionFactory getInstance() {
        logger.debug("creating a session factory");

        ServiceRegistry sr = CDIProxies.unproxifyIfPossible(serviceRegistry);

        return cfg.buildSessionFactory(sr);
    }

    public void destroy(@Disposes SessionFactory sessionFactory) {
        logger.debug("destroying session factory");
        sessionFactory.close();
    }
}