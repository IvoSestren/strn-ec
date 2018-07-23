package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.CustomerGroup;
import org.hibernate.Session;

import javax.inject.Inject;

public class CustomerGroupDAO extends GenericDAO<CustomerGroup> {

    /**
     * @deprecated CDI eyes only
     */
    protected CustomerGroupDAO() {
        this(null);
    }

    @Inject
    public CustomerGroupDAO(Session session) {
        super(session);
    }
}