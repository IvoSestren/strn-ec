package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.RangeWeight;
import org.hibernate.Session;

import javax.inject.Inject;

public class RangeWeightDAO extends GenericDAO<RangeWeight> {

    /**
     * @deprecated CDI eyes only
     */
    protected RangeWeightDAO() {
        this(null);
    }

    @Inject
    public RangeWeightDAO(Session session) {
        super(session);
    }
}