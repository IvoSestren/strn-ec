package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.CmsShop;
import org.hibernate.Session;

import javax.inject.Inject;

public class CmsShopDAO extends GenericDAO<CmsShop> {

    /**
     * @deprecated CDI eyes only
     */
    protected CmsShopDAO() {
        this(null);
    }

    @Inject
    public CmsShopDAO(Session session) {
        super(session);
    }
}