package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.MessageReaded;
import org.hibernate.Session;

import javax.inject.Inject;

public class MessageReadedDAO extends GenericDAO<MessageReaded> {

    /**
     * @deprecated CDI eyes only
     */
    protected MessageReadedDAO() {
        this(null);
    }

    @Inject
    public MessageReadedDAO(Session session) {
        super(session);
    }
}