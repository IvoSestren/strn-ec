package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.SmartyCache;
import org.hibernate.Session;

import javax.inject.Inject;

public class SmartyCacheDAO extends GenericDAO<SmartyCache> {

    /**
     * @deprecated CDI eyes only
     */
    protected SmartyCacheDAO() {
        this(null);
    }

    @Inject
    public SmartyCacheDAO(Session session) {
        super(session);
    }
}