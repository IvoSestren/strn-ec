package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Currencies;
import org.hibernate.Session;

import javax.inject.Inject;

public class CurrenciesDAO extends GenericDAO<Currencies> {

    /**
     * @deprecated CDI eyes only
     */
    protected CurrenciesDAO() {
        this(null);
    }

    @Inject
    public CurrenciesDAO(Session session) {
        super(session);
    }
}