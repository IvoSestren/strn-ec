package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.LayeredIndexableAttributeGroupLangValue;
import org.hibernate.Session;

import javax.inject.Inject;

public class LayeredIndexableAttributeGroupLangValueDAO extends GenericDAO<LayeredIndexableAttributeGroupLangValue> {

    /**
     * @deprecated CDI eyes only
     */
    protected LayeredIndexableAttributeGroupLangValueDAO() {
        this(null);
    }

    @Inject
    public LayeredIndexableAttributeGroupLangValueDAO(Session session) {
        super(session);
    }
}