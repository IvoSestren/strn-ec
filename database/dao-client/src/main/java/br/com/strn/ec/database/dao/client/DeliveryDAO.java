package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Delivery;
import org.hibernate.Session;

import javax.inject.Inject;

public class DeliveryDAO extends GenericDAO<Delivery> {

    /**
     * @deprecated CDI eyes only
     */
    protected DeliveryDAO() {
        this(null);
    }

    @Inject
    public DeliveryDAO(Session session) {
        super(session);
    }
}