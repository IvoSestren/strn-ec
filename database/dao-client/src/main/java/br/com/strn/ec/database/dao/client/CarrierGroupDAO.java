package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.CarrierGroup;
import org.hibernate.Session;

import javax.inject.Inject;

public class CarrierGroupDAO extends GenericDAO<CarrierGroup> {

    /**
     * @deprecated CDI eyes only
     */
    protected CarrierGroupDAO() {
        this(null);
    }

    @Inject
    public CarrierGroupDAO(Session session) {
        super(session);
    }
}