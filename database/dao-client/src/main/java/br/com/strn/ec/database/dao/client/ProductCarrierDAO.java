package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ProductCarrier;
import org.hibernate.Session;

import javax.inject.Inject;

public class ProductCarrierDAO extends GenericDAO<ProductCarrier> {

    /**
     * @deprecated CDI eyes only
     */
    protected ProductCarrierDAO() {
        this(null);
    }

    @Inject
    public ProductCarrierDAO(Session session) {
        super(session);
    }
}