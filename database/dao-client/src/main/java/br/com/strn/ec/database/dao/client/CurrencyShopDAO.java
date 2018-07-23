package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.CurrencyShop;
import org.hibernate.Session;

import javax.inject.Inject;

public class CurrencyShopDAO extends GenericDAO<CurrencyShop> {

    /**
     * @deprecated CDI eyes only
     */
    protected CurrencyShopDAO() {
        this(null);
    }

    @Inject
    public CurrencyShopDAO(Session session) {
        super(session);
    }
}