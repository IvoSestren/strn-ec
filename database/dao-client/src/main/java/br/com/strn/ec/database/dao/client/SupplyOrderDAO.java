package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.SupplyOrder;
import org.hibernate.Session;

import javax.inject.Inject;

public class SupplyOrderDAO extends GenericDAO<SupplyOrder> {

    /**
     * @deprecated CDI eyes only
     */
    protected SupplyOrderDAO() {
        this(null);
    }

    @Inject
    public SupplyOrderDAO(Session session) {
        super(session);
    }
}