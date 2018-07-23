package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Pagenotfound;
import org.hibernate.Session;

import javax.inject.Inject;

public class PagenotfoundDAO extends GenericDAO<Pagenotfound> {

    /**
     * @deprecated CDI eyes only
     */
    protected PagenotfoundDAO() {
        this(null);
    }

    @Inject
    public PagenotfoundDAO(Session session) {
        super(session);
    }
}