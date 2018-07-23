package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.TaxLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class TaxLangDAO extends GenericDAO<TaxLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected TaxLangDAO() {
        this(null);
    }

    @Inject
    public TaxLangDAO(Session session) {
        super(session);
    }
}