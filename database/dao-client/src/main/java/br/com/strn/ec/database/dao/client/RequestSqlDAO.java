package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.RequestSql;
import org.hibernate.Session;

import javax.inject.Inject;

public class RequestSqlDAO extends GenericDAO<RequestSql> {

    /**
     * @deprecated CDI eyes only
     */
    protected RequestSqlDAO() {
        this(null);
    }

    @Inject
    public RequestSqlDAO(Session session) {
        super(session);
    }
}