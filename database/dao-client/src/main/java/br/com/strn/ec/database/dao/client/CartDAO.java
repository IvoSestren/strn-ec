package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Cart;
import org.hibernate.Session;

import javax.inject.Inject;

public class CartDAO extends GenericDAO<Cart> {

    /**
     * @deprecated CDI eyes only
     */
    protected CartDAO() {
        this(null);
    }

    @Inject
    public CartDAO(Session session) {
        super(session);
    }
}