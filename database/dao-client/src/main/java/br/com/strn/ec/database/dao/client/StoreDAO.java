package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Store;
import org.hibernate.Session;

import javax.inject.Inject;

public class StoreDAO extends GenericDAO<Store> {

    /**
     * @deprecated CDI eyes only
     */
    protected StoreDAO() {
        this(null);
    }

    @Inject
    public StoreDAO(Session session) {
        super(session);
    }
}