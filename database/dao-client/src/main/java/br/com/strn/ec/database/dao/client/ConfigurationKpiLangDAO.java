package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ConfigurationKpiLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class ConfigurationKpiLangDAO extends GenericDAO<ConfigurationKpiLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected ConfigurationKpiLangDAO() {
        this(null);
    }

    @Inject
    public ConfigurationKpiLangDAO(Session session) {
        super(session);
    }
}