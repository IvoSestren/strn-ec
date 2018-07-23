package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.CategoryLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class CategoryLangDAO extends GenericDAO<CategoryLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected CategoryLangDAO() {
        this(null);
    }

    @Inject
    public CategoryLangDAO(Session session) {
        super(session);
    }
}