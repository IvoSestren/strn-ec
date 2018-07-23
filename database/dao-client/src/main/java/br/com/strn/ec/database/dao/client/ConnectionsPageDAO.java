package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ConnectionsPage;
import org.hibernate.Session;

import javax.inject.Inject;

public class ConnectionsPageDAO extends GenericDAO<ConnectionsPage> {

    /**
     * @deprecated CDI eyes only
     */
    protected ConnectionsPageDAO() {
        this(null);
    }

    @Inject
    public ConnectionsPageDAO(Session session) {
        super(session);
    }
}