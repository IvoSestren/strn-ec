package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ConfigurationLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class ConfigurationLangDAO extends GenericDAO<ConfigurationLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected ConfigurationLangDAO() {
        this(null);
    }

    @Inject
    public ConfigurationLangDAO(Session session) {
        super(session);
    }
}