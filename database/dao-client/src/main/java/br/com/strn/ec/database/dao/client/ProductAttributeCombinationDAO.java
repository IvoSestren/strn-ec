package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ProductAttributeCombination;
import org.hibernate.Session;

import javax.inject.Inject;

public class ProductAttributeCombinationDAO extends GenericDAO<ProductAttributeCombination> {

    /**
     * @deprecated CDI eyes only
     */
    protected ProductAttributeCombinationDAO() {
        this(null);
    }

    @Inject
    public ProductAttributeCombinationDAO(Session session) {
        super(session);
    }
}