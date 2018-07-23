package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Message;
import org.hibernate.Session;

import javax.inject.Inject;

public class MessageDAO extends GenericDAO<Message> {

    /**
     * @deprecated CDI eyes only
     */
    protected MessageDAO() {
        this(null);
    }

    @Inject
    public MessageDAO(Session session) {
        super(session);
    }
}