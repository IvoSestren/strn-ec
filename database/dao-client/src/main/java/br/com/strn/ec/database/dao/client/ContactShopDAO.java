package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ContactShop;
import org.hibernate.Session;

import javax.inject.Inject;

public class ContactShopDAO extends GenericDAO<ContactShop> {

    /**
     * @deprecated CDI eyes only
     */
    protected ContactShopDAO() {
        this(null);
    }

    @Inject
    public ContactShopDAO(Session session) {
        super(session);
    }
}