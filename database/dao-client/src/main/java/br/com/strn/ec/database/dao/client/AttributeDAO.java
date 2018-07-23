package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Attribute;
import org.hibernate.Session;

import javax.inject.Inject;

public class AttributeDAO extends GenericDAO<Attribute> {

    /**
     * @deprecated CDI eyes only
     */
    protected AttributeDAO() {
        this(null);
    }

    @Inject
    public AttributeDAO(Session session) {
        super(session);
    }
}