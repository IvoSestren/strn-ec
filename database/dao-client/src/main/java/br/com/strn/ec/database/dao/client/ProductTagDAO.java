package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ProductTag;
import org.hibernate.Session;

import javax.inject.Inject;

public class ProductTagDAO extends GenericDAO<ProductTag> {

    /**
     * @deprecated CDI eyes only
     */
    protected ProductTagDAO() {
        this(null);
    }

    @Inject
    public ProductTagDAO(Session session) {
        super(session);
    }
}