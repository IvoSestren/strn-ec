package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.LangShop;
import org.hibernate.Session;

import javax.inject.Inject;

public class LangShopDAO extends GenericDAO<LangShop> {

    /**
     * @deprecated CDI eyes only
     */
    protected LangShopDAO() {
        this(null);
    }

    @Inject
    public LangShopDAO(Session session) {
        super(session);
    }
}