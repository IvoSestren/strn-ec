package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.CountryLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class CountryLangDAO extends GenericDAO<CountryLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected CountryLangDAO() {
        this(null);
    }

    @Inject
    public CountryLangDAO(Session session) {
        super(session);
    }
}