package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.CustomizedData;
import org.hibernate.Session;

import javax.inject.Inject;

public class CustomizedDataDAO extends GenericDAO<CustomizedData> {

    /**
     * @deprecated CDI eyes only
     */
    protected CustomizedDataDAO() {
        this(null);
    }

    @Inject
    public CustomizedDataDAO(Session session) {
        super(session);
    }
}