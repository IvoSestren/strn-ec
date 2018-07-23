package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.CmsCategoryShop;
import org.hibernate.Session;

import javax.inject.Inject;

public class CmsCategoryShopDAO extends GenericDAO<CmsCategoryShop> {

    /**
     * @deprecated CDI eyes only
     */
    protected CmsCategoryShopDAO() {
        this(null);
    }

    @Inject
    public CmsCategoryShopDAO(Session session) {
        super(session);
    }
}