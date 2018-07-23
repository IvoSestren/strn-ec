package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ConnectionsSource;
import org.hibernate.Session;

import javax.inject.Inject;

public class ConnectionsSourceDAO extends GenericDAO<ConnectionsSource> {

    /**
     * @deprecated CDI eyes only
     */
    protected ConnectionsSourceDAO() {
        this(null);
    }

    @Inject
    public ConnectionsSourceDAO(Session session) {
        super(session);
    }
}