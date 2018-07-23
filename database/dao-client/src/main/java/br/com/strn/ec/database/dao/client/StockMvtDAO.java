package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.StockMvt;
import org.hibernate.Session;

import javax.inject.Inject;

public class StockMvtDAO extends GenericDAO<StockMvt> {

    /**
     * @deprecated CDI eyes only
     */
    protected StockMvtDAO() {
        this(null);
    }

    @Inject
    public StockMvtDAO(Session session) {
        super(session);
    }
}