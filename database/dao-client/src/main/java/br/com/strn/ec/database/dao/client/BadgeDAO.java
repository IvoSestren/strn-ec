package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Badge;
import org.hibernate.Session;

import javax.inject.Inject;

public class BadgeDAO extends GenericDAO<Badge> {

    /**
     * @deprecated CDI eyes only
     */
    protected BadgeDAO() {
        this(null);
    }

    @Inject
    public BadgeDAO(Session session) {
        super(session);
    }
}