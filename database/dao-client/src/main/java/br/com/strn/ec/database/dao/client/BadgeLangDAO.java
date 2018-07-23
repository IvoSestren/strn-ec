package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.BadgeLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class BadgeLangDAO extends GenericDAO<BadgeLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected BadgeLangDAO() {
        this(null);
    }

    @Inject
    public BadgeLangDAO(Session session) {
        super(session);
    }
}