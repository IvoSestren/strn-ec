package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.CategoryGroup;
import org.hibernate.Session;

import javax.inject.Inject;

public class CategoryGroupDAO extends GenericDAO<CategoryGroup> {

    /**
     * @deprecated CDI eyes only
     */
    protected CategoryGroupDAO() {
        this(null);
    }

    @Inject
    public CategoryGroupDAO(Session session) {
        super(session);
    }
}