package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.OrderCartRule;
import org.hibernate.Session;

import javax.inject.Inject;

public class OrderCartRuleDAO extends GenericDAO<OrderCartRule> {

    /**
     * @deprecated CDI eyes only
     */
    protected OrderCartRuleDAO() {
        this(null);
    }

    @Inject
    public OrderCartRuleDAO(Session session) {
        super(session);
    }
}