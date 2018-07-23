package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ProductLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class ProductLangDAO extends GenericDAO<ProductLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected ProductLangDAO() {
        this(null);
    }

    @Inject
    public ProductLangDAO(Session session) {
        super(session);
    }
}