package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.OperatingSystem;
import org.hibernate.Session;

import javax.inject.Inject;

public class OperatingSystemDAO extends GenericDAO<OperatingSystem> {

    /**
     * @deprecated CDI eyes only
     */
    protected OperatingSystemDAO() {
        this(null);
    }

    @Inject
    public OperatingSystemDAO(Session session) {
        super(session);
    }
}