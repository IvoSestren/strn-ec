package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Address;
import org.hibernate.Session;

import javax.inject.Inject;

public class AddressDAO extends GenericDAO<Address> {

    /**
     * @deprecated CDI eyes only
     */
    protected AddressDAO() {
        this(null);
    }

    @Inject
    public AddressDAO(Session session) {
        super(session);
    }
}