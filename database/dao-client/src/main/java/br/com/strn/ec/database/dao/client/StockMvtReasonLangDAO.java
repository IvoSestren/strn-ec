package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.StockMvtReasonLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class StockMvtReasonLangDAO extends GenericDAO<StockMvtReasonLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected StockMvtReasonLangDAO() {
        this(null);
    }

    @Inject
    public StockMvtReasonLangDAO(Session session) {
        super(session);
    }
}