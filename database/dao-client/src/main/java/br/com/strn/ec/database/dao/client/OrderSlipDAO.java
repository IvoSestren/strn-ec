package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.OrderSlip;
import org.hibernate.Session;

import javax.inject.Inject;

public class OrderSlipDAO extends GenericDAO<OrderSlip> {

    /**
     * @deprecated CDI eyes only
     */
    protected OrderSlipDAO() {
        this(null);
    }

    @Inject
    public OrderSlipDAO(Session session) {
        super(session);
    }
}