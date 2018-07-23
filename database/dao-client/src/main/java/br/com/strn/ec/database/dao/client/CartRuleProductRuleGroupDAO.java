package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.CartRuleProductRuleGroup;
import org.hibernate.Session;

import javax.inject.Inject;

public class CartRuleProductRuleGroupDAO extends GenericDAO<CartRuleProductRuleGroup> {

    /**
     * @deprecated CDI eyes only
     */
    protected CartRuleProductRuleGroupDAO() {
        this(null);
    }

    @Inject
    public CartRuleProductRuleGroupDAO(Session session) {
        super(session);
    }
}