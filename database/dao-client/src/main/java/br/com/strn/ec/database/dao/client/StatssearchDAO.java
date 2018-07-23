package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Statssearch;
import org.hibernate.Session;

import javax.inject.Inject;

public class StatssearchDAO extends GenericDAO<Statssearch> {

    /**
     * @deprecated CDI eyes only
     */
    protected StatssearchDAO() {
        this(null);
    }

    @Inject
    public StatssearchDAO(Session session) {
        super(session);
    }
}