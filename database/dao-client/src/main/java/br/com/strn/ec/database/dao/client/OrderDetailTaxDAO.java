package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.OrderDetailTax;
import org.hibernate.Session;

import javax.inject.Inject;

public class OrderDetailTaxDAO extends GenericDAO<OrderDetailTax> {

    /**
     * @deprecated CDI eyes only
     */
    protected OrderDetailTaxDAO() {
        this(null);
    }

    @Inject
    public OrderDetailTaxDAO(Session session) {
        super(session);
    }
}