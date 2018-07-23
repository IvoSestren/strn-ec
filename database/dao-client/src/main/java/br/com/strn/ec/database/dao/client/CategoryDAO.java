package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Category;
import org.hibernate.Session;

import javax.inject.Inject;

public class CategoryDAO extends GenericDAO<Category> {

    /**
     * @deprecated CDI eyes only
     */
    protected CategoryDAO() {
        this(null);
    }

    @Inject
    public CategoryDAO(Session session) {
        super(session);
    }
}