package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ConditionBadge;
import org.hibernate.Session;

import javax.inject.Inject;

public class ConditionBadgeDAO extends GenericDAO<ConditionBadge> {

    /**
     * @deprecated CDI eyes only
     */
    protected ConditionBadgeDAO() {
        this(null);
    }

    @Inject
    public ConditionBadgeDAO(Session session) {
        super(session);
    }
}