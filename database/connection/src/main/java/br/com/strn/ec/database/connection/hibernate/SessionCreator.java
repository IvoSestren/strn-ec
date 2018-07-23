package br.com.strn.ec.database.connection.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

public class SessionCreator {

    private final SessionFactory factory;
    private final Logger logger;

    /**
     * @deprecated CDI eyes only
     */
    protected SessionCreator() {
        this(null, null);
    }

    @Inject
    public SessionCreator(SessionFactory factory, Logger logger) {
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

    @Produces
    @RequestScoped
    @Default
    public Session geInstanceClient() {
        // TODO: Pegar o schema do token

        String schema;
//        if (domainSchema != null) {
//            schema = domainSchema.getSchema();
//        } else {
        schema = "public";
//        }


        Session session = factory
                .withOptions()
                .tenantIdentifier(schema)
                .openSession();
        logger.debug("opening a session {}", session);
        return session;
    }

    public void destroyMaster(@Disposes @DbMaster Session session) {
        logger.debug("Closing session master {}", session);
        session.close();
    }

    public void destroyClient(@Disposes Session session) {
        logger.debug("Closing session client {}", session);
        session.close();
    }
}
