package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ProductGroupReductionCache;
import org.hibernate.Session;

import javax.inject.Inject;

public class ProductGroupReductionCacheDAO extends GenericDAO<ProductGroupReductionCache> {

    /**
     * @deprecated CDI eyes only
     */
    protected ProductGroupReductionCacheDAO() {
        this(null);
    }

    @Inject
    public ProductGroupReductionCacheDAO(Session session) {
        super(session);
    }
}