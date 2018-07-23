package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ShopUrl;
import org.hibernate.Session;

import javax.inject.Inject;

public class ShopUrlDAO extends GenericDAO<ShopUrl> {

    /**
     * @deprecated CDI eyes only
     */
    protected ShopUrlDAO() {
        this(null);
    }

    @Inject
    public ShopUrlDAO(Session session) {
        super(session);
    }
}