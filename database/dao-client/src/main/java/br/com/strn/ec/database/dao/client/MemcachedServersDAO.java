package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.MemcachedServers;
import org.hibernate.Session;

import javax.inject.Inject;

public class MemcachedServersDAO extends GenericDAO<MemcachedServers> {

    /**
     * @deprecated CDI eyes only
     */
    protected MemcachedServersDAO() {
        this(null);
    }

    @Inject
    public MemcachedServersDAO(Session session) {
        super(session);
    }
}