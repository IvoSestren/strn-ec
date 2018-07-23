package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.CartRuleCarrier;
import org.hibernate.Session;

import javax.inject.Inject;

public class CartRuleCarrierDAO extends GenericDAO<CartRuleCarrier> {

    /**
     * @deprecated CDI eyes only
     */
    protected CartRuleCarrierDAO() {
        this(null);
    }

    @Inject
    public CartRuleCarrierDAO(Session session) {
        super(session);
    }
}