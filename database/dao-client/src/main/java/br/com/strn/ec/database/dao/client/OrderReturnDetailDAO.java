package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.OrderReturnDetail;
import org.hibernate.Session;

import javax.inject.Inject;

public class OrderReturnDetailDAO extends GenericDAO<OrderReturnDetail> {

    /**
     * @deprecated CDI eyes only
     */
    protected OrderReturnDetailDAO() {
        this(null);
    }

    @Inject
    public OrderReturnDetailDAO(Session session) {
        super(session);
    }
}