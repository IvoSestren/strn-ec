package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.OrderInvoicePayment;
import org.hibernate.Session;

import javax.inject.Inject;

public class OrderInvoicePaymentDAO extends GenericDAO<OrderInvoicePayment> {

    /**
     * @deprecated CDI eyes only
     */
    protected OrderInvoicePaymentDAO() {
        this(null);
    }

    @Inject
    public OrderInvoicePaymentDAO(Session session) {
        super(session);
    }
}