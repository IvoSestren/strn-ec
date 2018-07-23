package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.HookModuleExceptions;
import org.hibernate.Session;

import javax.inject.Inject;

public class HookModuleExceptionsDAO extends GenericDAO<HookModuleExceptions> {

    /**
     * @deprecated CDI eyes only
     */
    protected HookModuleExceptionsDAO() {
        this(null);
    }

    @Inject
    public HookModuleExceptionsDAO(Session session) {
        super(session);
    }
}