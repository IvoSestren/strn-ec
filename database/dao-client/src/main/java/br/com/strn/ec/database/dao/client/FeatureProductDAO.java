package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.FeatureProduct;
import org.hibernate.Session;

import javax.inject.Inject;

public class FeatureProductDAO extends GenericDAO<FeatureProduct> {

    /**
     * @deprecated CDI eyes only
     */
    protected FeatureProductDAO() {
        this(null);
    }

    @Inject
    public FeatureProductDAO(Session session) {
        super(session);
    }
}