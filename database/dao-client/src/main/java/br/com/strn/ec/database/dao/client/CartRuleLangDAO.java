package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.CartRuleLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class CartRuleLangDAO extends GenericDAO<CartRuleLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected CartRuleLangDAO() {
        this(null);
    }

    @Inject
    public CartRuleLangDAO(Session session) {
        super(session);
    }
}