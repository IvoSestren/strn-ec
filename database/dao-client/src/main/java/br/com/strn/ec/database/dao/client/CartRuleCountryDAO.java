package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.CartRuleCountry;
import org.hibernate.Session;

import javax.inject.Inject;

public class CartRuleCountryDAO extends GenericDAO<CartRuleCountry> {

    /**
     * @deprecated CDI eyes only
     */
    protected CartRuleCountryDAO() {
        this(null);
    }

    @Inject
    public CartRuleCountryDAO(Session session) {
        super(session);
    }
}