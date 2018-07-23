package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Contact;
import org.hibernate.Session;

import javax.inject.Inject;

public class ContactDAO extends GenericDAO<Contact> {

    /**
     * @deprecated CDI eyes only
     */
    protected ContactDAO() {
        this(null);
    }

    @Inject
    public ContactDAO(Session session) {
        super(session);
    }
}