package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.LayeredProductAttribute;
import org.hibernate.Session;

import javax.inject.Inject;

public class LayeredProductAttributeDAO extends GenericDAO<LayeredProductAttribute> {

    /**
     * @deprecated CDI eyes only
     */
    protected LayeredProductAttributeDAO() {
        this(null);
    }

    @Inject
    public LayeredProductAttributeDAO(Session session) {
        super(session);
    }
}