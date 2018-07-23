package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.LayeredIndexableFeatureValueLangValue;
import org.hibernate.Session;

import javax.inject.Inject;

public class LayeredIndexableFeatureValueLangValueDAO extends GenericDAO<LayeredIndexableFeatureValueLangValue> {

    /**
     * @deprecated CDI eyes only
     */
    protected LayeredIndexableFeatureValueLangValueDAO() {
        this(null);
    }

    @Inject
    public LayeredIndexableFeatureValueLangValueDAO(Session session) {
        super(session);
    }
}