package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.AttributeGroupShop;
import org.hibernate.Session;

import javax.inject.Inject;

public class AttributeGroupShopDAO extends GenericDAO<AttributeGroupShop> {

    /**
     * @deprecated CDI eyes only
     */
    protected AttributeGroupShopDAO() {
        this(null);
    }

    @Inject
    public AttributeGroupShopDAO(Session session) {
        super(session);
    }
}