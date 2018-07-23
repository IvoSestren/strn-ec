package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.SpecificPricePriority;
import org.hibernate.Session;

import javax.inject.Inject;

public class SpecificPricePriorityDAO extends GenericDAO<SpecificPricePriority> {

    /**
     * @deprecated CDI eyes only
     */
    protected SpecificPricePriorityDAO() {
        this(null);
    }

    @Inject
    public SpecificPricePriorityDAO(Session session) {
        super(session);
    }
}