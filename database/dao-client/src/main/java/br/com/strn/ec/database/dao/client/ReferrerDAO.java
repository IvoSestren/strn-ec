package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Referrer;
import org.hibernate.Session;

import javax.inject.Inject;

public class ReferrerDAO extends GenericDAO<Referrer> {

    /**
     * @deprecated CDI eyes only
     */
    protected ReferrerDAO() {
        this(null);
    }

    @Inject
    public ReferrerDAO(Session session) {
        super(session);
    }
}