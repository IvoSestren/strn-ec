package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.SupplyOrderDetail;
import org.hibernate.Session;

import javax.inject.Inject;

public class SupplyOrderDetailDAO extends GenericDAO<SupplyOrderDetail> {

    /**
     * @deprecated CDI eyes only
     */
    protected SupplyOrderDetailDAO() {
        this(null);
    }

    @Inject
    public SupplyOrderDetailDAO(Session session) {
        super(session);
    }
}