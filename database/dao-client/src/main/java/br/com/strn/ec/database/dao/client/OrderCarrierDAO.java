package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.OrderCarrier;
import org.hibernate.Session;

import javax.inject.Inject;

public class OrderCarrierDAO extends GenericDAO<OrderCarrier> {

    /**
     * @deprecated CDI eyes only
     */
    protected OrderCarrierDAO() {
        this(null);
    }

    @Inject
    public OrderCarrierDAO(Session session) {
        super(session);
    }
}