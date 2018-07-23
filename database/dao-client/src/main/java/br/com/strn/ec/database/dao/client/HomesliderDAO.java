package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Homeslider;
import org.hibernate.Session;

import javax.inject.Inject;

public class HomesliderDAO extends GenericDAO<Homeslider> {

    /**
     * @deprecated CDI eyes only
     */
    protected HomesliderDAO() {
        this(null);
    }

    @Inject
    public HomesliderDAO(Session session) {
        super(session);
    }
}