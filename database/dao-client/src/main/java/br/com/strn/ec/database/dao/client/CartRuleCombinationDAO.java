package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.CartRuleCombination;
import org.hibernate.Session;

import javax.inject.Inject;

public class CartRuleCombinationDAO extends GenericDAO<CartRuleCombination> {

    /**
     * @deprecated CDI eyes only
     */
    protected CartRuleCombinationDAO() {
        this(null);
    }

    @Inject
    public CartRuleCombinationDAO(Session session) {
        super(session);
    }
}