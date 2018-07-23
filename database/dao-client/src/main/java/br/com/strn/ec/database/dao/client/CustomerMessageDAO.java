package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.CustomerMessage;
import org.hibernate.Session;

import javax.inject.Inject;

public class CustomerMessageDAO extends GenericDAO<CustomerMessage> {

    /**
     * @deprecated CDI eyes only
     */
    protected CustomerMessageDAO() {
        this(null);
    }

    @Inject
    public CustomerMessageDAO(Session session) {
        super(session);
    }
}