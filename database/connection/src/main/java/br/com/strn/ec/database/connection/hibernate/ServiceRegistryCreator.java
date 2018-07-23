package br.com.strn.ec.database.connection.hibernate;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.slf4j.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

public class ServiceRegistryCreator {

    private final Configuration cfg;
    private final Logger logger;

    /**
     * @deprecated CDI eyes only.
     */
    protected ServiceRegistryCreator() {
        this(null, null);
    }

    @Inject
    public ServiceRegistryCreator(Configuration cfg, Logger logger) {
        this.cfg = cfg;
        this.logger = logger;
    }

    @Produces
    @ApplicationScoped
    public ServiceRegistry getInstance() {
        logger.debug("creating a service registry");
        return new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
    }

    public void destroy(@Disposes ServiceRegistry serviceRegistry) {
        logger.debug("destroying service registry");
        StandardServiceRegistryBuilder.destroy(serviceRegistry);
    }
}
