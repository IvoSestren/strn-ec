package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ContactLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class ContactLangDAO extends GenericDAO<ContactLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected ContactLangDAO() {
        this(null);
    }

    @Inject
    public ContactLangDAO(Session session) {
        super(session);
    }
}