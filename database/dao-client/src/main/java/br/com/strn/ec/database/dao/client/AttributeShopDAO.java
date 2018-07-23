package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.AttributeShop;
import org.hibernate.Session;

import javax.inject.Inject;

public class AttributeShopDAO extends GenericDAO<AttributeShop> {

    /**
     * @deprecated CDI eyes only
     */
    protected AttributeShopDAO() {
        this(null);
    }

    @Inject
    public AttributeShopDAO(Session session) {
        super(session);
    }
}