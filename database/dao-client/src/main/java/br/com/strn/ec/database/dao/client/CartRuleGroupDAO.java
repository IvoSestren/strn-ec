package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.CartRuleGroup;
import org.hibernate.Session;

import javax.inject.Inject;

public class CartRuleGroupDAO extends GenericDAO<CartRuleGroup> {

    /**
     * @deprecated CDI eyes only
     */
    protected CartRuleGroupDAO() {
        this(null);
    }

    @Inject
    public CartRuleGroupDAO(Session session) {
        super(session);
    }
}