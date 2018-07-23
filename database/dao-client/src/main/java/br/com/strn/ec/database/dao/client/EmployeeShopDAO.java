package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.EmployeeShop;
import org.hibernate.Session;

import javax.inject.Inject;

public class EmployeeShopDAO extends GenericDAO<EmployeeShop> {

    /**
     * @deprecated CDI eyes only
     */
    protected EmployeeShopDAO() {
        this(null);
    }

    @Inject
    public EmployeeShopDAO(Session session) {
        super(session);
    }
}