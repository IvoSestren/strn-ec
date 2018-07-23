package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.CategoryProduct;
import org.hibernate.Session;

import javax.inject.Inject;

public class CategoryProductDAO extends GenericDAO<CategoryProduct> {

    /**
     * @deprecated CDI eyes only
     */
    protected CategoryProductDAO() {
        this(null);
    }

    @Inject
    public CategoryProductDAO(Session session) {
        super(session);
    }
}