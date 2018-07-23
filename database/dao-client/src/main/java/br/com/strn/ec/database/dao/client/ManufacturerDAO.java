package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Manufacturer;
import org.hibernate.Session;

import javax.inject.Inject;

public class ManufacturerDAO extends GenericDAO<Manufacturer> {

    /**
     * @deprecated CDI eyes only
     */
    protected ManufacturerDAO() {
        this(null);
    }

    @Inject
    public ManufacturerDAO(Session session) {
        super(session);
    }
}