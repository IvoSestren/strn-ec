package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.SupplyOrderReceiptHistory;
import org.hibernate.Session;

import javax.inject.Inject;

public class SupplyOrderReceiptHistoryDAO extends GenericDAO<SupplyOrderReceiptHistory> {

    /**
     * @deprecated CDI eyes only
     */
    protected SupplyOrderReceiptHistoryDAO() {
        this(null);
    }

    @Inject
    public SupplyOrderReceiptHistoryDAO(Session session) {
        super(session);
    }
}