package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.StoreShop;
import org.hibernate.Session;

import javax.inject.Inject;

public class StoreShopDAO extends GenericDAO<StoreShop> {

    /**
     * @deprecated CDI eyes only
     */
    protected StoreShopDAO() {
        this(null);
    }

    @Inject
    public StoreShopDAO(Session session) {
        super(session);
    }
}