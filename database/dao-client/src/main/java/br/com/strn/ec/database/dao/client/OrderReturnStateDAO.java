package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.OrderReturnState;
import org.hibernate.Session;

import javax.inject.Inject;

public class OrderReturnStateDAO extends GenericDAO<OrderReturnState> {

    /**
     * @deprecated CDI eyes only
     */
    protected OrderReturnStateDAO() {
        this(null);
    }

    @Inject
    public OrderReturnStateDAO(Session session) {
        super(session);
    }
}