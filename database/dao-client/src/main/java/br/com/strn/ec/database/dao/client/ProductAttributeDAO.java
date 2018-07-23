package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ProductAttribute;
import org.hibernate.Session;

import javax.inject.Inject;

public class ProductAttributeDAO extends GenericDAO<ProductAttribute> {

    /**
     * @deprecated CDI eyes only
     */
    protected ProductAttributeDAO() {
        this(null);
    }

    @Inject
    public ProductAttributeDAO(Session session) {
        super(session);
    }
}