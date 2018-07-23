package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Product;
import org.hibernate.Session;

import javax.inject.Inject;

public class ProductDAO extends GenericDAO<Product> {

    /**
     * @deprecated CDI eyes only
     */
    protected ProductDAO() {
        this(null);
    }

    @Inject
    public ProductDAO(Session session) {
        super(session);
    }
}