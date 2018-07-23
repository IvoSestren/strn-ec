package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.CartRuleProductRule;
import org.hibernate.Session;

import javax.inject.Inject;

public class CartRuleProductRuleDAO extends GenericDAO<CartRuleProductRule> {

    /**
     * @deprecated CDI eyes only
     */
    protected CartRuleProductRuleDAO() {
        this(null);
    }

    @Inject
    public CartRuleProductRuleDAO(Session session) {
        super(session);
    }
}