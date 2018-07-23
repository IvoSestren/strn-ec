package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.OrderState;
import org.hibernate.Session;

import javax.inject.Inject;

public class OrderStateDAO extends GenericDAO<OrderState> {

    /**
     * @deprecated CDI eyes only
     */
    protected OrderStateDAO() {
        this(null);
    }

    @Inject
    public OrderStateDAO(Session session) {
        super(session);
    }
}