package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Emailsubscription;
import org.hibernate.Session;

import javax.inject.Inject;

public class EmailsubscriptionDAO extends GenericDAO<Emailsubscription> {

    /**
     * @deprecated CDI eyes only
     */
    protected EmailsubscriptionDAO() {
        this(null);
    }

    @Inject
    public EmailsubscriptionDAO(Session session) {
        super(session);
    }
}