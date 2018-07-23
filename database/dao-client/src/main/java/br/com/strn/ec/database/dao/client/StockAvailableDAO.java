package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.StockAvailable;
import org.hibernate.Session;

import javax.inject.Inject;

public class StockAvailableDAO extends GenericDAO<StockAvailable> {

    /**
     * @deprecated CDI eyes only
     */
    protected StockAvailableDAO() {
        this(null);
    }

    @Inject
    public StockAvailableDAO(Session session) {
        super(session);
    }
}