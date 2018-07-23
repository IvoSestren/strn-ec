package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Connections;
import org.hibernate.Session;

import javax.inject.Inject;

public class ConnectionsDAO extends GenericDAO<Connections> {

    /**
     * @deprecated CDI eyes only
     */
    protected ConnectionsDAO() {
        this(null);
    }

    @Inject
    public ConnectionsDAO(Session session) {
        super(session);
    }
}