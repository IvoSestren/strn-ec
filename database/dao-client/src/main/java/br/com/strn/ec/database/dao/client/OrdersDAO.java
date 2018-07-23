package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Orders;
import org.hibernate.Session;

import javax.inject.Inject;

public class OrdersDAO extends GenericDAO<Orders> {

    /**
     * @deprecated CDI eyes only
     */
    protected OrdersDAO() {
        this(null);
    }

    @Inject
    public OrdersDAO(Session session) {
        super(session);
    }
}