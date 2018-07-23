package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.CustomerThread;
import org.hibernate.Session;

import javax.inject.Inject;

public class CustomerThreadDAO extends GenericDAO<CustomerThread> {

    /**
     * @deprecated CDI eyes only
     */
    protected CustomerThreadDAO() {
        this(null);
    }

    @Inject
    public CustomerThreadDAO(Session session) {
        super(session);
    }
}