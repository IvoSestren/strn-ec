package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.OrderSlipDetailTax;
import org.hibernate.Session;

import javax.inject.Inject;

public class OrderSlipDetailTaxDAO extends GenericDAO<OrderSlipDetailTax> {

    /**
     * @deprecated CDI eyes only
     */
    protected OrderSlipDetailTaxDAO() {
        this(null);
    }

    @Inject
    public OrderSlipDetailTaxDAO(Session session) {
        super(session);
    }
}