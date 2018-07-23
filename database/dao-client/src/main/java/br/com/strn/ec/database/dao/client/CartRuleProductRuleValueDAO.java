package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.CartRuleProductRuleValue;
import org.hibernate.Session;

import javax.inject.Inject;

public class CartRuleProductRuleValueDAO extends GenericDAO<CartRuleProductRuleValue> {

    /**
     * @deprecated CDI eyes only
     */
    protected CartRuleProductRuleValueDAO() {
        this(null);
    }

    @Inject
    public CartRuleProductRuleValueDAO(Session session) {
        super(session);
    }
}