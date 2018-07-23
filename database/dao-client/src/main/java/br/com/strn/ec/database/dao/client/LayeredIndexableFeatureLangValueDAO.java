package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.LayeredIndexableFeatureLangValue;
import org.hibernate.Session;

import javax.inject.Inject;

public class LayeredIndexableFeatureLangValueDAO extends GenericDAO<LayeredIndexableFeatureLangValue> {

    /**
     * @deprecated CDI eyes only
     */
    protected LayeredIndexableFeatureLangValueDAO() {
        this(null);
    }

    @Inject
    public LayeredIndexableFeatureLangValueDAO(Session session) {
        super(session);
    }
}