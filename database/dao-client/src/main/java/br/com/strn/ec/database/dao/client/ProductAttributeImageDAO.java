package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ProductAttributeImage;
import org.hibernate.Session;

import javax.inject.Inject;

public class ProductAttributeImageDAO extends GenericDAO<ProductAttributeImage> {

    /**
     * @deprecated CDI eyes only
     */
    protected ProductAttributeImageDAO() {
        this(null);
    }

    @Inject
    public ProductAttributeImageDAO(Session session) {
        super(session);
    }
}