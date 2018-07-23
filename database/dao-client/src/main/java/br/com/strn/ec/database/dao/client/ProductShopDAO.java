package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ProductShop;
import org.hibernate.Session;

import javax.inject.Inject;

public class ProductShopDAO extends GenericDAO<ProductShop> {

    /**
     * @deprecated CDI eyes only
     */
    protected ProductShopDAO() {
        this(null);
    }

    @Inject
    public ProductShopDAO(Session session) {
        super(session);
    }
}