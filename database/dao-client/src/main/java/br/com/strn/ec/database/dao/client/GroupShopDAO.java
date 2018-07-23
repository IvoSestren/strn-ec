package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.GroupShop;
import org.hibernate.Session;

import javax.inject.Inject;

public class GroupShopDAO extends GenericDAO<GroupShop> {

    /**
     * @deprecated CDI eyes only
     */
    protected GroupShopDAO() {
        this(null);
    }

    @Inject
    public GroupShopDAO(Session session) {
        super(session);
    }
}