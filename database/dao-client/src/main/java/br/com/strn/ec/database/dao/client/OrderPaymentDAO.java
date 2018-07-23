package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.OrderPayment;
import org.hibernate.Session;

import javax.inject.Inject;

public class OrderPaymentDAO extends GenericDAO<OrderPayment> {

    /**
     * @deprecated CDI eyes only
     */
    protected OrderPaymentDAO() {
        this(null);
    }

    @Inject
    public OrderPaymentDAO(Session session) {
        super(session);
    }
}