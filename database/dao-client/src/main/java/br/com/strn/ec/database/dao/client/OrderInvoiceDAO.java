package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.OrderInvoice;
import org.hibernate.Session;

import javax.inject.Inject;

public class OrderInvoiceDAO extends GenericDAO<OrderInvoice> {

    /**
     * @deprecated CDI eyes only
     */
    protected OrderInvoiceDAO() {
        this(null);
    }

    @Inject
    public OrderInvoiceDAO(Session session) {
        super(session);
    }
}