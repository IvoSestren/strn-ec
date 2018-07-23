package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.LayeredIndexableAttributeLangValue;
import org.hibernate.Session;

import javax.inject.Inject;

public class LayeredIndexableAttributeLangValueDAO extends GenericDAO<LayeredIndexableAttributeLangValue> {

    /**
     * @deprecated CDI eyes only
     */
    protected LayeredIndexableAttributeLangValueDAO() {
        this(null);
    }

    @Inject
    public LayeredIndexableAttributeLangValueDAO(Session session) {
        super(session);
    }
}