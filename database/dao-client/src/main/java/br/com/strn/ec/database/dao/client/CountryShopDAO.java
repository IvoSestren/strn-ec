package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.CountryShop;
import org.hibernate.Session;

import javax.inject.Inject;

public class CountryShopDAO extends GenericDAO<CountryShop> {

    /**
     * @deprecated CDI eyes only
     */
    protected CountryShopDAO() {
        this(null);
    }

    @Inject
    public CountryShopDAO(Session session) {
        super(session);
    }
}