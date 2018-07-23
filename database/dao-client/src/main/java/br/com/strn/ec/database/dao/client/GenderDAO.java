package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Gender;
import org.hibernate.Session;

import javax.inject.Inject;

public class GenderDAO extends GenericDAO<Gender> {

    /**
     * @deprecated CDI eyes only
     */
    protected GenderDAO() {
        this(null);
    }

    @Inject
    public GenderDAO(Session session) {
        super(session);
    }
}