package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Guest;
import org.hibernate.Session;

import javax.inject.Inject;

public class GuestDAO extends GenericDAO<Guest> {

    /**
     * @deprecated CDI eyes only
     */
    protected GuestDAO() {
        this(null);
    }

    @Inject
    public GuestDAO(Session session) {
        super(session);
    }
}