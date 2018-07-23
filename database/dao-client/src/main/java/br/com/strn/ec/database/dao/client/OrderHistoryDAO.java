package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.OrderHistory;
import org.hibernate.Session;

import javax.inject.Inject;

public class OrderHistoryDAO extends GenericDAO<OrderHistory> {

    /**
     * @deprecated CDI eyes only
     */
    protected OrderHistoryDAO() {
        this(null);
    }

    @Inject
    public OrderHistoryDAO(Session session) {
        super(session);
    }
}