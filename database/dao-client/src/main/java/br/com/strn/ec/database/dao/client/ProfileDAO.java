package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Profile;
import org.hibernate.Session;

import javax.inject.Inject;

public class ProfileDAO extends GenericDAO<Profile> {

    /**
     * @deprecated CDI eyes only
     */
    protected ProfileDAO() {
        this(null);
    }

    @Inject
    public ProfileDAO(Session session) {
        super(session);
    }
}