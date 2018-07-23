package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.WarehouseShop;
import org.hibernate.Session;

import javax.inject.Inject;

public class WarehouseShopDAO extends GenericDAO<WarehouseShop> {

    /**
     * @deprecated CDI eyes only
     */
    protected WarehouseShopDAO() {
        this(null);
    }

    @Inject
    public WarehouseShopDAO(Session session) {
        super(session);
    }
}