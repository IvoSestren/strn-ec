package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ImageType;
import org.hibernate.Session;

import javax.inject.Inject;

public class ImageTypeDAO extends GenericDAO<ImageType> {

    /**
     * @deprecated CDI eyes only
     */
    protected ImageTypeDAO() {
        this(null);
    }

    @Inject
    public ImageTypeDAO(Session session) {
        super(session);
    }
}