package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.DateRange;
import org.hibernate.Session;

import javax.inject.Inject;

public class DateRangeDAO extends GenericDAO<DateRange> {

    /**
     * @deprecated CDI eyes only
     */
    protected DateRangeDAO() {
        this(null);
    }

    @Inject
    public DateRangeDAO(Session session) {
        super(session);
    }
}