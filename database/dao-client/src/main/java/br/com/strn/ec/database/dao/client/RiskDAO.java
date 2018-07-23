package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Risk;
import org.hibernate.Session;

import javax.inject.Inject;

public class RiskDAO extends GenericDAO<Risk> {

    /**
     * @deprecated CDI eyes only
     */
    protected RiskDAO() {
        this(null);
    }

    @Inject
    public RiskDAO(Session session) {
        super(session);
    }
}