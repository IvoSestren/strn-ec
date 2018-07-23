package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ReferrerCache;
import org.hibernate.Session;

import javax.inject.Inject;

public class ReferrerCacheDAO extends GenericDAO<ReferrerCache> {

    /**
     * @deprecated CDI eyes only
     */
    protected ReferrerCacheDAO() {
        this(null);
    }

    @Inject
    public ReferrerCacheDAO(Session session) {
        super(session);
    }
}