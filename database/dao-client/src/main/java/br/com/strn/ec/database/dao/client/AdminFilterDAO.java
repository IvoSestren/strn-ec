package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.AdminFilter;
import org.hibernate.Session;

import javax.inject.Inject;

public class AdminFilterDAO extends GenericDAO<AdminFilter> {

    /**
     * @deprecated CDI eyes only
     */
    protected AdminFilterDAO() {
        this(null);
    }

    @Inject
    public AdminFilterDAO(Session session) {
        super(session);
    }
}