package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ModuleCurrency;
import org.hibernate.Session;

import javax.inject.Inject;

public class ModuleCurrencyDAO extends GenericDAO<ModuleCurrency> {

    /**
     * @deprecated CDI eyes only
     */
    protected ModuleCurrencyDAO() {
        this(null);
    }

    @Inject
    public ModuleCurrencyDAO(Session session) {
        super(session);
    }
}