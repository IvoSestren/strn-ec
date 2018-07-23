package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Log;
import org.hibernate.Session;

import javax.inject.Inject;

public class LogDAO extends GenericDAO<Log> {

    /**
     * @deprecated CDI eyes only
     */
    protected LogDAO() {
        this(null);
    }

    @Inject
    public LogDAO(Session session) {
        super(session);
    }
}