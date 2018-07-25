package br.com.strn.ec.database.connection.hibernate;

import br.com.strn.ec.database.connection.domain.DomainSchema;
import br.com.strn.ec.database.connection.domain.Domains;
import br.com.strn.ec.database.entities.master.SysUrl;
import br.com.strn.ec.util.domain.Domain;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.slf4j.Logger;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import java.util.List;

public class SessionCreator {

    private final SessionFactory factory;
    private final Logger logger;
    private final Session sessionMaster;
    private final Domain domain;
    private final Domains domains;

    /**
     * @deprecated CDI eyes only
     */
    protected SessionCreator() {
        this(null, null, null, null, null);
    }

    @Inject
    public SessionCreator(SessionFactory factory, Logger logger, Domains domains, @DbMaster Session sessionMaster, Domain domain) {
        this.factory = factory;
        this.logger = logger;
        this.domains = domains;
        this.sessionMaster = sessionMaster;
        this.domain = domain;
    }

    @Produces
    @RequestScoped
    @Default
    public Session geInstanceClient() {
        // TODO: Pegar o schema do token

        String schema = findSchema();

        Session session = factory
                .withOptions()
                .tenantIdentifier(schema)
                .openSession();
        logger.debug("opening a session {}", session);
        return session;
    }

    public void destroyClient(@Disposes Session session) {
        logger.debug("Closing session client {}", session);
        session.close();
    }

    private String findSchema() {
        String res = null;

        DomainSchema domainSchema = domains.getFromDomain(domain.name());
        if (domainSchema != null) {
            res = domainSchema.getSchema();
        }

        if (res == null || "".equals(res.trim())) {
            SysUrl sysUrl = fromDomain(domain.name());
            if (sysUrl != null) {
                res = sysUrl.getSchema().getSchema();
                if (res != null && !"".equals(res)) {
                    domains.getDomainSchemas().add(new DomainSchema(domain.name(), res));
                }
            }
        }

        // Caso nao encontre o schema, deixa somente o public
        if (res == null || "".equals(res.trim())) {
            res = "public";
        }


        return res;
    }

    private SysUrl fromDomain(String url) {
        Query<SysUrl> q = sessionMaster.createNativeQuery("SELECT a.* FROM sysurl a WHERE SUBSTRING(:url FROM a.url) <> ''", SysUrl.class);
        q.setParameter("url", url);

        List<SysUrl> sysUrls = q.getResultList();

        if (sysUrls.size() > 0)
            return sysUrls.get(0);

        return null;
    }
}
