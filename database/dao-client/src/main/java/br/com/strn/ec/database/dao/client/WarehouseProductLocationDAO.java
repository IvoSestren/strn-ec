package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.WarehouseProductLocation;
import org.hibernate.Session;

import javax.inject.Inject;

public class WarehouseProductLocationDAO extends GenericDAO<WarehouseProductLocation> {

    /**
     * @deprecated CDI eyes only
     */
    protected WarehouseProductLocationDAO() {
        this(null);
    }

    @Inject
    public WarehouseProductLocationDAO(Session session) {
        super(session);
    }
}