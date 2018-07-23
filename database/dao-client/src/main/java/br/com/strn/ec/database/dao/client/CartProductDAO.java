package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.CartProduct;
import org.hibernate.Session;

import javax.inject.Inject;

public class CartProductDAO extends GenericDAO<CartProduct> {

    /**
     * @deprecated CDI eyes only
     */
    protected CartProductDAO() {
        this(null);
    }

    @Inject
    public CartProductDAO(Session session) {
        super(session);
    }
}