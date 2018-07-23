package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ModuleCountry;
import org.hibernate.Session;

import javax.inject.Inject;

public class ModuleCountryDAO extends GenericDAO<ModuleCountry> {

    /**
     * @deprecated CDI eyes only
     */
    protected ModuleCountryDAO() {
        this(null);
    }

    @Inject
    public ModuleCountryDAO(Session session) {
        super(session);
    }
}