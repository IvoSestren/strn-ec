package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ModuleHistory;
import org.hibernate.Session;

import javax.inject.Inject;

public class ModuleHistoryDAO extends GenericDAO<ModuleHistory> {

    /**
     * @deprecated CDI eyes only
     */
    protected ModuleHistoryDAO() {
        this(null);
    }

    @Inject
    public ModuleHistoryDAO(Session session) {
        super(session);
    }
}