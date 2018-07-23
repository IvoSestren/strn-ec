package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.WebservicePermission;
import org.hibernate.Session;

import javax.inject.Inject;

public class WebservicePermissionDAO extends GenericDAO<WebservicePermission> {

    /**
     * @deprecated CDI eyes only
     */
    protected WebservicePermissionDAO() {
        this(null);
    }

    @Inject
    public WebservicePermissionDAO(Session session) {
        super(session);
    }
}