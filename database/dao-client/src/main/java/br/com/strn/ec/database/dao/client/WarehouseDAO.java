package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Warehouse;
import org.hibernate.Session;

import javax.inject.Inject;

public class WarehouseDAO extends GenericDAO<Warehouse> {

    /**
     * @deprecated CDI eyes only
     */
    protected WarehouseDAO() {
        this(null);
    }

    @Inject
    public WarehouseDAO(Session session) {
        super(session);
    }
}