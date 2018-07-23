package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.SmartyLazyCache;
import org.hibernate.Session;

import javax.inject.Inject;

public class SmartyLazyCacheDAO extends GenericDAO<SmartyLazyCache> {

    /**
     * @deprecated CDI eyes only
     */
    protected SmartyLazyCacheDAO() {
        this(null);
    }

    @Inject
    public SmartyLazyCacheDAO(Session session) {
        super(session);
    }
}