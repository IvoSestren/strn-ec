package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.State;
import org.hibernate.Session;

import javax.inject.Inject;

public class StateDAO extends GenericDAO<State> {

    /**
     * @deprecated CDI eyes only
     */
    protected StateDAO() {
        this(null);
    }

    @Inject
    public StateDAO(Session session) {
        super(session);
    }
}