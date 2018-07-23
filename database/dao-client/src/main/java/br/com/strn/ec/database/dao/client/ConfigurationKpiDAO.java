package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ConfigurationKpi;
import org.hibernate.Session;

import javax.inject.Inject;

public class ConfigurationKpiDAO extends GenericDAO<ConfigurationKpi> {

    /**
     * @deprecated CDI eyes only
     */
    protected ConfigurationKpiDAO() {
        this(null);
    }

    @Inject
    public ConfigurationKpiDAO(Session session) {
        super(session);
    }
}