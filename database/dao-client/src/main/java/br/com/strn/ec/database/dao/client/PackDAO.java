package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Pack;
import org.hibernate.Session;

import javax.inject.Inject;

public class PackDAO extends GenericDAO<Pack> {

    /**
     * @deprecated CDI eyes only
     */
    protected PackDAO() {
        this(null);
    }

    @Inject
    public PackDAO(Session session) {
        super(session);
    }
}