package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Reassurance;
import org.hibernate.Session;

import javax.inject.Inject;

public class ReassuranceDAO extends GenericDAO<Reassurance> {

    /**
     * @deprecated CDI eyes only
     */
    protected ReassuranceDAO() {
        this(null);
    }

    @Inject
    public ReassuranceDAO(Session session) {
        super(session);
    }
}