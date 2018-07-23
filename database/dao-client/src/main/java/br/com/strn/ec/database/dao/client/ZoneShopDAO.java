package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ZoneShop;
import org.hibernate.Session;

import javax.inject.Inject;

public class ZoneShopDAO extends GenericDAO<ZoneShop> {

    /**
     * @deprecated CDI eyes only
     */
    protected ZoneShopDAO() {
        this(null);
    }

    @Inject
    public ZoneShopDAO(Session session) {
        super(session);
    }
}