package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.AuthorizationRole;
import org.hibernate.Session;

import javax.inject.Inject;

public class AuthorizationRoleDAO extends GenericDAO<AuthorizationRole> {

    /**
     * @deprecated CDI eyes only
     */
    protected AuthorizationRoleDAO() {
        this(null);
    }

    @Inject
    public AuthorizationRoleDAO(Session session) {
        super(session);
    }
}