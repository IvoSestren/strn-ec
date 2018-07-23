package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.CarrierZone;
import org.hibernate.Session;

import javax.inject.Inject;

public class CarrierZoneDAO extends GenericDAO<CarrierZone> {

    /**
     * @deprecated CDI eyes only
     */
    protected CarrierZoneDAO() {
        this(null);
    }

    @Inject
    public CarrierZoneDAO(Session session) {
        super(session);
    }
}