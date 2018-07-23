package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.LayeredCategory;
import org.hibernate.Session;

import javax.inject.Inject;

public class LayeredCategoryDAO extends GenericDAO<LayeredCategory> {

    /**
     * @deprecated CDI eyes only
     */
    protected LayeredCategoryDAO() {
        this(null);
    }

    @Inject
    public LayeredCategoryDAO(Session session) {
        super(session);
    }
}