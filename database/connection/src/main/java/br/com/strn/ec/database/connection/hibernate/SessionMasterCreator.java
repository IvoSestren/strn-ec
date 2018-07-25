package br.com.strn.ec.database.connection.hibernate;

import br.com.strn.ec.database.connection.domain.DomainSchema;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

public class SessionMasterCreator {

    private final SessionFactory factory;
    private final Logger logger;

    /**
     * @deprecated CDI eyes only
     */
    protected SessionMasterCreator() {
        this(null, null);
    }

    @Inject
    public SessionMasterCreator(SessionFactory factory, Logger logger) {
        this.factory = factory;
        this.logger = logger;
    }

    @Produces
    @RequestScoped
    @DbMaster
    public Session getInstanceMaster() {
        Session session = factory
                .withOptions()
                .tenantIdentifier("public")
                .openSession();
        logger.debug("opening a session {}", session);
        return session;
    }

    public void destroyMaster(@Disposes @DbMaster Session session) {
        logger.debug("Closing session master {}", session);
        session.close();
    }
}
