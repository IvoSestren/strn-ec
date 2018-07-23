package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.HomesliderSlides;
import org.hibernate.Session;

import javax.inject.Inject;

public class HomesliderSlidesDAO extends GenericDAO<HomesliderSlides> {

    /**
     * @deprecated CDI eyes only
     */
    protected HomesliderSlidesDAO() {
        this(null);
    }

    @Inject
    public HomesliderSlidesDAO(Session session) {
        super(session);
    }
}