package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.WebserviceAccount;
import org.hibernate.Session;

import javax.inject.Inject;

public class WebserviceAccountDAO extends GenericDAO<WebserviceAccount> {

    /**
     * @deprecated CDI eyes only
     */
    protected WebserviceAccountDAO() {
        this(null);
    }

    @Inject
    public WebserviceAccountDAO(Session session) {
        super(session);
    }
}