package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.OrderReturn;
import org.hibernate.Session;

import javax.inject.Inject;

public class OrderReturnDAO extends GenericDAO<OrderReturn> {

    /**
     * @deprecated CDI eyes only
     */
    protected OrderReturnDAO() {
        this(null);
    }

    @Inject
    public OrderReturnDAO(Session session) {
        super(session);
    }
}