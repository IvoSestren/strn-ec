package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.OrderMessage;
import org.hibernate.Session;

import javax.inject.Inject;

public class OrderMessageDAO extends GenericDAO<OrderMessage> {

    /**
     * @deprecated CDI eyes only
     */
    protected OrderMessageDAO() {
        this(null);
    }

    @Inject
    public OrderMessageDAO(Session session) {
        super(session);
    }
}