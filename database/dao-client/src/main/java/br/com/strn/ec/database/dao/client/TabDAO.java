package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Tab;
import org.hibernate.Session;

import javax.inject.Inject;

public class TabDAO extends GenericDAO<Tab> {

    /**
     * @deprecated CDI eyes only
     */
    protected TabDAO() {
        this(null);
    }

    @Inject
    public TabDAO(Session session) {
        super(session);
    }
}