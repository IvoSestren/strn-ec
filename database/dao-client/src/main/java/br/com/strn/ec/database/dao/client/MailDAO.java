package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Mail;
import org.hibernate.Session;

import javax.inject.Inject;

public class MailDAO extends GenericDAO<Mail> {

    /**
     * @deprecated CDI eyes only
     */
    protected MailDAO() {
        this(null);
    }

    @Inject
    public MailDAO(Session session) {
        super(session);
    }
}