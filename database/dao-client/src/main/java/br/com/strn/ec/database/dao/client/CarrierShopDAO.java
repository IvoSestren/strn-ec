package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.CarrierShop;
import org.hibernate.Session;

import javax.inject.Inject;

public class CarrierShopDAO extends GenericDAO<CarrierShop> {

    /**
     * @deprecated CDI eyes only
     */
    protected CarrierShopDAO() {
        this(null);
    }

    @Inject
    public CarrierShopDAO(Session session) {
        super(session);
    }
}