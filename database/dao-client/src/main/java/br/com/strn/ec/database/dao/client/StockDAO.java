package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Stock;
import org.hibernate.Session;

import javax.inject.Inject;

public class StockDAO extends GenericDAO<Stock> {

    /**
     * @deprecated CDI eyes only
     */
    protected StockDAO() {
        this(null);
    }

    @Inject
    public StockDAO(Session session) {
        super(session);
    }
}