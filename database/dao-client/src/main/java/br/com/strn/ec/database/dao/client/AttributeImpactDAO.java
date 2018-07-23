package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.AttributeImpact;
import org.hibernate.Session;

import javax.inject.Inject;

public class AttributeImpactDAO extends GenericDAO<AttributeImpact> {

    /**
     * @deprecated CDI eyes only
     */
    protected AttributeImpactDAO() {
        this(null);
    }

    @Inject
    public AttributeImpactDAO(Session session) {
        super(session);
    }
}