package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.PageViewed;
import org.hibernate.Session;

import javax.inject.Inject;

public class PageViewedDAO extends GenericDAO<PageViewed> {

    /**
     * @deprecated CDI eyes only
     */
    protected PageViewedDAO() {
        this(null);
    }

    @Inject
    public PageViewedDAO(Session session) {
        super(session);
    }
}