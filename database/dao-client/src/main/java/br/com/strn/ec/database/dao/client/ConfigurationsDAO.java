package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Configurations;
import org.hibernate.Session;

import javax.inject.Inject;

public class ConfigurationsDAO extends GenericDAO<Configurations> {

    /**
     * @deprecated CDI eyes only
     */
    protected ConfigurationsDAO() {
        this(null);
    }

    @Inject
    public ConfigurationsDAO(Session session) {
        super(session);
    }
}