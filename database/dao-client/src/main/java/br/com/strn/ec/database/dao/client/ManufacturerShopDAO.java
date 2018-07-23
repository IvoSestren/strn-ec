package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ManufacturerShop;
import org.hibernate.Session;

import javax.inject.Inject;

public class ManufacturerShopDAO extends GenericDAO<ManufacturerShop> {

    /**
     * @deprecated CDI eyes only
     */
    protected ManufacturerShopDAO() {
        this(null);
    }

    @Inject
    public ManufacturerShopDAO(Session session) {
        super(session);
    }
}