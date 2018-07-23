package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.WebBrowser;
import org.hibernate.Session;

import javax.inject.Inject;

public class WebBrowserDAO extends GenericDAO<WebBrowser> {

    /**
     * @deprecated CDI eyes only
     */
    protected WebBrowserDAO() {
        this(null);
    }

    @Inject
    public WebBrowserDAO(Session session) {
        super(session);
    }
}