package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.HookModule;
import org.hibernate.Session;

import javax.inject.Inject;

public class HookModuleDAO extends GenericDAO<HookModule> {

    /**
     * @deprecated CDI eyes only
     */
    protected HookModuleDAO() {
        this(null);
    }

    @Inject
    public HookModuleDAO(Session session) {
        super(session);
    }
}