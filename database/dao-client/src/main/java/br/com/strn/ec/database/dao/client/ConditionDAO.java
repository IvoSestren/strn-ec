package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Condition;
import org.hibernate.Session;

import javax.inject.Inject;

public class ConditionDAO extends GenericDAO<Condition> {

    /**
     * @deprecated CDI eyes only
     */
    protected ConditionDAO() {
        this(null);
    }

    @Inject
    public ConditionDAO(Session session) {
        super(session);
    }
}