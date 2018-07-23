package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ProductCountryTax;
import org.hibernate.Session;

import javax.inject.Inject;

public class ProductCountryTaxDAO extends GenericDAO<ProductCountryTax> {

    /**
     * @deprecated CDI eyes only
     */
    protected ProductCountryTaxDAO() {
        this(null);
    }

    @Inject
    public ProductCountryTaxDAO(Session session) {
        super(session);
    }
}