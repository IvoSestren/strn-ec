package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.PageType;
import org.hibernate.Session;

import javax.inject.Inject;

public class PageTypeDAO extends GenericDAO<PageType> {

    /**
     * @deprecated CDI eyes only
     */
    protected PageTypeDAO() {
        this(null);
    }

    @Inject
    public PageTypeDAO(Session session) {
        super(session);
    }
}