package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Timezone;
import org.hibernate.Session;

import javax.inject.Inject;

public class TimezoneDAO extends GenericDAO<Timezone> {

    /**
     * @deprecated CDI eyes only
     */
    protected TimezoneDAO() {
        this(null);
    }

    @Inject
    public TimezoneDAO(Session session) {
        super(session);
    }
}