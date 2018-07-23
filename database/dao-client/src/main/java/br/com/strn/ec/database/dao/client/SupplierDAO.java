package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Supplier;
import org.hibernate.Session;

import javax.inject.Inject;

public class SupplierDAO extends GenericDAO<Supplier> {

    /**
     * @deprecated CDI eyes only
     */
    protected SupplierDAO() {
        this(null);
    }

    @Inject
    public SupplierDAO(Session session) {
        super(session);
    }
}