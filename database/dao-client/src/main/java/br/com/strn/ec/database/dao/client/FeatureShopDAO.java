package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.FeatureShop;
import org.hibernate.Session;

import javax.inject.Inject;

public class FeatureShopDAO extends GenericDAO<FeatureShop> {

    /**
     * @deprecated CDI eyes only
     */
    protected FeatureShopDAO() {
        this(null);
    }

    @Inject
    public FeatureShopDAO(Session session) {
        super(session);
    }
}