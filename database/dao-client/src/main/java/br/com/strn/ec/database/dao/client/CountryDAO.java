package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Country;
import org.hibernate.Session;

import javax.inject.Inject;

public class CountryDAO extends GenericDAO<Country> {

    /**
     * @deprecated CDI eyes only
     */
    protected CountryDAO() {
        this(null);
    }

    @Inject
    public CountryDAO(Session session) {
        super(session);
    }
}