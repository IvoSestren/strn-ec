package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.RangePrice;
import org.hibernate.Session;

import javax.inject.Inject;

public class RangePriceDAO extends GenericDAO<RangePrice> {

    /**
     * @deprecated CDI eyes only
     */
    protected RangePriceDAO() {
        this(null);
    }

    @Inject
    public RangePriceDAO(Session session) {
        super(session);
    }
}