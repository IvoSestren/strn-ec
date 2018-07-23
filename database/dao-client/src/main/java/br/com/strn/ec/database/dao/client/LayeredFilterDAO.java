package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.LayeredFilter;
import org.hibernate.Session;

import javax.inject.Inject;

public class LayeredFilterDAO extends GenericDAO<LayeredFilter> {

    /**
     * @deprecated CDI eyes only
     */
    protected LayeredFilterDAO() {
        this(null);
    }

    @Inject
    public LayeredFilterDAO(Session session) {
        super(session);
    }
}