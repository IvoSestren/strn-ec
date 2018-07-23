package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Image;
import org.hibernate.Session;

import javax.inject.Inject;

public class ImageDAO extends GenericDAO<Image> {

    /**
     * @deprecated CDI eyes only
     */
    protected ImageDAO() {
        this(null);
    }

    @Inject
    public ImageDAO(Session session) {
        super(session);
    }
}