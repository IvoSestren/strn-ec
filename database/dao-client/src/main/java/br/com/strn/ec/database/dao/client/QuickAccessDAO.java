package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.QuickAccess;
import org.hibernate.Session;

import javax.inject.Inject;

public class QuickAccessDAO extends GenericDAO<QuickAccess> {

    /**
     * @deprecated CDI eyes only
     */
    protected QuickAccessDAO() {
        this(null);
    }

    @Inject
    public QuickAccessDAO(Session session) {
        super(session);
    }
}