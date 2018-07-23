package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ProductAttributeShop;
import org.hibernate.Session;

import javax.inject.Inject;

public class ProductAttributeShopDAO extends GenericDAO<ProductAttributeShop> {

    /**
     * @deprecated CDI eyes only
     */
    protected ProductAttributeShopDAO() {
        this(null);
    }

    @Inject
    public ProductAttributeShopDAO(Session session) {
        super(session);
    }
}