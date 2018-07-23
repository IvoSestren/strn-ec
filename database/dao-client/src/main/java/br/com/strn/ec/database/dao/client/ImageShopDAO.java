package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ImageShop;
import org.hibernate.Session;

import javax.inject.Inject;

public class ImageShopDAO extends GenericDAO<ImageShop> {

    /**
     * @deprecated CDI eyes only
     */
    protected ImageShopDAO() {
        this(null);
    }

    @Inject
    public ImageShopDAO(Session session) {
        super(session);
    }
}