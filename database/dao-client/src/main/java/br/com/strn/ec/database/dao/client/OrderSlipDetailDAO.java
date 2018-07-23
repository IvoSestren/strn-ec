package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.OrderSlipDetail;
import org.hibernate.Session;

import javax.inject.Inject;

public class OrderSlipDetailDAO extends GenericDAO<OrderSlipDetail> {

    /**
     * @deprecated CDI eyes only
     */
    protected OrderSlipDetailDAO() {
        this(null);
    }

    @Inject
    public OrderSlipDetailDAO(Session session) {
        super(session);
    }
}