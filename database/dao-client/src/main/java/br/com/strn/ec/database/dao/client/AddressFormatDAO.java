package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.AddressFormat;
import org.hibernate.Session;

import javax.inject.Inject;

public class AddressFormatDAO extends GenericDAO<AddressFormat> {

    /**
     * @deprecated CDI eyes only
     */
    protected AddressFormatDAO() {
        this(null);
    }

    @Inject
    public AddressFormatDAO(Session session) {
        super(session);
    }
}