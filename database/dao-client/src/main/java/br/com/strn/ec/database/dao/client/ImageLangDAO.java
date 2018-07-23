package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ImageLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class ImageLangDAO extends GenericDAO<ImageLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected ImageLangDAO() {
        this(null);
    }

    @Inject
    public ImageLangDAO(Session session) {
        super(session);
    }
}