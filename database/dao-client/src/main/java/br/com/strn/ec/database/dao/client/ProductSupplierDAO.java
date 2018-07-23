package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ProductSupplier;
import org.hibernate.Session;

import javax.inject.Inject;

public class ProductSupplierDAO extends GenericDAO<ProductSupplier> {

    /**
     * @deprecated CDI eyes only
     */
    protected ProductSupplierDAO() {
        this(null);
    }

    @Inject
    public ProductSupplierDAO(Session session) {
        super(session);
    }
}