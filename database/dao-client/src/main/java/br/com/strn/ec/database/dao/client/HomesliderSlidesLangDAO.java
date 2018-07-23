package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.HomesliderSlidesLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class HomesliderSlidesLangDAO extends GenericDAO<HomesliderSlidesLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected HomesliderSlidesLangDAO() {
        this(null);
    }

    @Inject
    public HomesliderSlidesLangDAO(Session session) {
        super(session);
    }
}