package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.OrderDetail;
import org.hibernate.Session;

import javax.inject.Inject;

public class OrderDetailDAO extends GenericDAO<OrderDetail> {

    /**
     * @deprecated CDI eyes only
     */
    protected OrderDetailDAO() {
        this(null);
    }

    @Inject
    public OrderDetailDAO(Session session) {
        super(session);
    }
}