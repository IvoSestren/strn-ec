package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ReferrerShop;
import org.hibernate.Session;

import javax.inject.Inject;

public class ReferrerShopDAO extends GenericDAO<ReferrerShop> {

    /**
     * @deprecated CDI eyes only
     */
    protected ReferrerShopDAO() {
        this(null);
    }

    @Inject
    public ReferrerShopDAO(Session session) {
        super(session);
    }
}