package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ShopGroup;
import org.hibernate.Session;

import javax.inject.Inject;

public class ShopGroupDAO extends GenericDAO<ShopGroup> {

    /**
     * @deprecated CDI eyes only
     */
    protected ShopGroupDAO() {
        this(null);
    }

    @Inject
    public ShopGroupDAO(Session session) {
        super(session);
    }
}