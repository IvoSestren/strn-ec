package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.SupplyOrderHistory;
import org.hibernate.Session;

import javax.inject.Inject;

public class SupplyOrderHistoryDAO extends GenericDAO<SupplyOrderHistory> {

    /**
     * @deprecated CDI eyes only
     */
    protected SupplyOrderHistoryDAO() {
        this(null);
    }

    @Inject
    public SupplyOrderHistoryDAO(Session session) {
        super(session);
    }
}