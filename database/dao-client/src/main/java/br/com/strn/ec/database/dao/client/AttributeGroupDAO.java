package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.AttributeGroup;
import org.hibernate.Session;

import javax.inject.Inject;

public class AttributeGroupDAO extends GenericDAO<AttributeGroup> {

    /**
     * @deprecated CDI eyes only
     */
    protected AttributeGroupDAO() {
        this(null);
    }

    @Inject
    public AttributeGroupDAO(Session session) {
        super(session);
    }
}