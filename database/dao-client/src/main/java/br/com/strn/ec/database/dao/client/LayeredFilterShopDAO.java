package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.LayeredFilterShop;
import org.hibernate.Session;

import javax.inject.Inject;

public class LayeredFilterShopDAO extends GenericDAO<LayeredFilterShop> {

    /**
     * @deprecated CDI eyes only
     */
    protected LayeredFilterShopDAO() {
        this(null);
    }

    @Inject
    public LayeredFilterShopDAO(Session session) {
        super(session);
    }
}