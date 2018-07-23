package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ProductSale;
import org.hibernate.Session;

import javax.inject.Inject;

public class ProductSaleDAO extends GenericDAO<ProductSale> {

    /**
     * @deprecated CDI eyes only
     */
    protected ProductSaleDAO() {
        this(null);
    }

    @Inject
    public ProductSaleDAO(Session session) {
        super(session);
    }
}