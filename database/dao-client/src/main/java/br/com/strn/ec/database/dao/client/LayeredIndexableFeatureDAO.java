package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.LayeredIndexableFeature;
import org.hibernate.Session;

import javax.inject.Inject;

public class LayeredIndexableFeatureDAO extends GenericDAO<LayeredIndexableFeature> {

    /**
     * @deprecated CDI eyes only
     */
    protected LayeredIndexableFeatureDAO() {
        this(null);
    }

    @Inject
    public LayeredIndexableFeatureDAO(Session session) {
        super(session);
    }
}