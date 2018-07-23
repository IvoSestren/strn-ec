package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.CartRule;
import org.hibernate.Session;

import javax.inject.Inject;

public class CartRuleDAO extends GenericDAO<CartRule> {

    /**
     * @deprecated CDI eyes only
     */
    protected CartRuleDAO() {
        this(null);
    }

    @Inject
    public CartRuleDAO(Session session) {
        super(session);
    }
}