package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Group;
import org.hibernate.Session;

import javax.inject.Inject;

public class GroupDAO extends GenericDAO<Group> {

    /**
     * @deprecated CDI eyes only
     */
    protected GroupDAO() {
        this(null);
    }

    @Inject
    public GroupDAO(Session session) {
        super(session);
    }
}