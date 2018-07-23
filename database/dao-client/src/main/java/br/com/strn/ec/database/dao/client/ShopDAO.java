package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Shop;
import org.hibernate.Session;

import javax.inject.Inject;

public class ShopDAO extends GenericDAO<Shop> {

    /**
     * @deprecated CDI eyes only
     */
    protected ShopDAO() {
        this(null);
    }

    @Inject
    public ShopDAO(Session session) {
        super(session);
    }
}