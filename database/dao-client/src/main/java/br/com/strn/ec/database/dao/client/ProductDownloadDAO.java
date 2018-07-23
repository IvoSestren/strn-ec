package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ProductDownload;
import org.hibernate.Session;

import javax.inject.Inject;

public class ProductDownloadDAO extends GenericDAO<ProductDownload> {

    /**
     * @deprecated CDI eyes only
     */
    protected ProductDownloadDAO() {
        this(null);
    }

    @Inject
    public ProductDownloadDAO(Session session) {
        super(session);
    }
}