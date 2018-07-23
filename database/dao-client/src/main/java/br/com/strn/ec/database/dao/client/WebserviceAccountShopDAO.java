package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.WebserviceAccountShop;
import org.hibernate.Session;

import javax.inject.Inject;

public class WebserviceAccountShopDAO extends GenericDAO<WebserviceAccountShop> {

    /**
     * @deprecated CDI eyes only
     */
    protected WebserviceAccountShopDAO() {
        this(null);
    }

    @Inject
    public WebserviceAccountShopDAO(Session session) {
        super(session);
    }
}