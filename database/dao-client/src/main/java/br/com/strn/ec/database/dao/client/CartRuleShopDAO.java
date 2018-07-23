package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.CartRuleShop;
import org.hibernate.Session;

import javax.inject.Inject;

public class CartRuleShopDAO extends GenericDAO<CartRuleShop> {

    /**
     * @deprecated CDI eyes only
     */
    protected CartRuleShopDAO() {
        this(null);
    }

    @Inject
    public CartRuleShopDAO(Session session) {
        super(session);
    }
}