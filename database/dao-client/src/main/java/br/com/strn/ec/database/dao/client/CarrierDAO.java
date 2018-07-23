package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Carrier;
import org.hibernate.Session;

import javax.inject.Inject;

public class CarrierDAO extends GenericDAO<Carrier> {

    /**
     * @deprecated CDI eyes only
     */
    protected CarrierDAO() {
        this(null);
    }

    @Inject
    public CarrierDAO(Session session) {
        super(session);
    }
}