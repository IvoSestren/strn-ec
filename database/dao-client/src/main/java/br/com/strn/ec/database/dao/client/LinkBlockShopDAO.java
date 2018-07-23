package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.LinkBlockShop;
import org.hibernate.Session;

import javax.inject.Inject;

public class LinkBlockShopDAO extends GenericDAO<LinkBlockShop> {

    /**
     * @deprecated CDI eyes only
     */
    protected LinkBlockShopDAO() {
        this(null);
    }

    @Inject
    public LinkBlockShopDAO(Session session) {
        super(session);
    }
}