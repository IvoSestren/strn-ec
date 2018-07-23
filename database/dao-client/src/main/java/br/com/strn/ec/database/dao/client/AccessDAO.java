package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Access;
import org.hibernate.Session;

import javax.inject.Inject;

public class AccessDAO extends GenericDAO<Access> {

    /**
     * @deprecated CDI eyes only
     */
    protected AccessDAO() {
        this(null);
    }

    @Inject
    public AccessDAO(Session session) {
        super(session);
    }
}