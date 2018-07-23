package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.CustomerMessageSyncImap;
import org.hibernate.Session;

import javax.inject.Inject;

public class CustomerMessageSyncImapDAO extends GenericDAO<CustomerMessageSyncImap> {

    /**
     * @deprecated CDI eyes only
     */
    protected CustomerMessageSyncImapDAO() {
        this(null);
    }

    @Inject
    public CustomerMessageSyncImapDAO(Session session) {
        super(session);
    }
}