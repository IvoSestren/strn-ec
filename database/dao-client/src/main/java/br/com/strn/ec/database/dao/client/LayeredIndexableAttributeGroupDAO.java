package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.LayeredIndexableAttributeGroup;
import org.hibernate.Session;

import javax.inject.Inject;

public class LayeredIndexableAttributeGroupDAO extends GenericDAO<LayeredIndexableAttributeGroup> {

    /**
     * @deprecated CDI eyes only
     */
    protected LayeredIndexableAttributeGroupDAO() {
        this(null);
    }

    @Inject
    public LayeredIndexableAttributeGroupDAO(Session session) {
        super(session);
    }
}