package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Zone;
import org.hibernate.Session;

import javax.inject.Inject;

public class ZoneDAO extends GenericDAO<Zone> {

    /**
     * @deprecated CDI eyes only
     */
    protected ZoneDAO() {
        this(null);
    }

    @Inject
    public ZoneDAO(Session session) {
        super(session);
    }
}