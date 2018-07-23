package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.WarehouseCarrier;
import org.hibernate.Session;

import javax.inject.Inject;

public class WarehouseCarrierDAO extends GenericDAO<WarehouseCarrier> {

    /**
     * @deprecated CDI eyes only
     */
    protected WarehouseCarrierDAO() {
        this(null);
    }

    @Inject
    public WarehouseCarrierDAO(Session session) {
        super(session);
    }
}