package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.FeatureValue;
import org.hibernate.Session;

import javax.inject.Inject;

public class FeatureValueDAO extends GenericDAO<FeatureValue> {

    /**
     * @deprecated CDI eyes only
     */
    protected FeatureValueDAO() {
        this(null);
    }

    @Inject
    public FeatureValueDAO(Session session) {
        super(session);
    }
}