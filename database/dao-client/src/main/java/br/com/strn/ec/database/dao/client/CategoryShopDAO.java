package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.CategoryShop;
import org.hibernate.Session;

import javax.inject.Inject;

public class CategoryShopDAO extends GenericDAO<CategoryShop> {

    /**
     * @deprecated CDI eyes only
     */
    protected CategoryShopDAO() {
        this(null);
    }

    @Inject
    public CategoryShopDAO(Session session) {
        super(session);
    }
}