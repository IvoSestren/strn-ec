package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Page;
import org.hibernate.Session;

import javax.inject.Inject;

public class PageDAO extends GenericDAO<Page> {

    /**
     * @deprecated CDI eyes only
     */
    protected PageDAO() {
        this(null);
    }

    @Inject
    public PageDAO(Session session) {
        super(session);
    }
}