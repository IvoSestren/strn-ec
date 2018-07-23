package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ProductAttachment;
import org.hibernate.Session;

import javax.inject.Inject;

public class ProductAttachmentDAO extends GenericDAO<ProductAttachment> {

    /**
     * @deprecated CDI eyes only
     */
    protected ProductAttachmentDAO() {
        this(null);
    }

    @Inject
    public ProductAttachmentDAO(Session session) {
        super(session);
    }
}