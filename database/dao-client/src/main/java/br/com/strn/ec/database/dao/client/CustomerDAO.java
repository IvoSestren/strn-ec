package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Customer;
import org.hibernate.Session;

import javax.inject.Inject;

public class CustomerDAO extends GenericDAO<Customer> {

    /**
     * @deprecated CDI eyes only
     */
    protected CustomerDAO() {
        this(null);
    }

    @Inject
    public CustomerDAO(Session session) {
        super(session);
    }
}