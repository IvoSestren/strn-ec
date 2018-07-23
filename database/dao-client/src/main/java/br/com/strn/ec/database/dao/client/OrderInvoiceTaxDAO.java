package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.OrderInvoiceTax;
import org.hibernate.Session;

import javax.inject.Inject;

public class OrderInvoiceTaxDAO extends GenericDAO<OrderInvoiceTax> {

    /**
     * @deprecated CDI eyes only
     */
    protected OrderInvoiceTaxDAO() {
        this(null);
    }

    @Inject
    public OrderInvoiceTaxDAO(Session session) {
        super(session);
    }
}