package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ConditionAdvice;
import org.hibernate.Session;

import javax.inject.Inject;

public class ConditionAdviceDAO extends GenericDAO<ConditionAdvice> {

    /**
     * @deprecated CDI eyes only
     */
    protected ConditionAdviceDAO() {
        this(null);
    }

    @Inject
    public ConditionAdviceDAO(Session session) {
        super(session);
    }
}