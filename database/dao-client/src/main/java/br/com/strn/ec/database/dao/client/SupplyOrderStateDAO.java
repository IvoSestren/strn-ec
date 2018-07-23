package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.SupplyOrderState;
import org.hibernate.Session;

import javax.inject.Inject;

public class SupplyOrderStateDAO extends GenericDAO<SupplyOrderState> {

    /**
     * @deprecated CDI eyes only
     */
    protected SupplyOrderStateDAO() {
        this(null);
    }

    @Inject
    public SupplyOrderStateDAO(Session session) {
        super(session);
    }
}