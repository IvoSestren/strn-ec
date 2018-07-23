package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.SupplierShop;
import org.hibernate.Session;

import javax.inject.Inject;

public class SupplierShopDAO extends GenericDAO<SupplierShop> {

    /**
     * @deprecated CDI eyes only
     */
    protected SupplierShopDAO() {
        this(null);
    }

    @Inject
    public SupplierShopDAO(Session session) {
        super(session);
    }
}