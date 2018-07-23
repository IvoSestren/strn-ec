package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Feature;
import org.hibernate.Session;

import javax.inject.Inject;

public class FeatureDAO extends GenericDAO<Feature> {

    /**
     * @deprecated CDI eyes only
     */
    protected FeatureDAO() {
        this(null);
    }

    @Inject
    public FeatureDAO(Session session) {
        super(session);
    }
}