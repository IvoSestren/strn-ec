package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.StockMvtReason;
import org.hibernate.Session;

import javax.inject.Inject;

public class StockMvtReasonDAO extends GenericDAO<StockMvtReason> {

    /**
     * @deprecated CDI eyes only
     */
    protected StockMvtReasonDAO() {
        this(null);
    }

    @Inject
    public StockMvtReasonDAO(Session session) {
        super(session);
    }
}