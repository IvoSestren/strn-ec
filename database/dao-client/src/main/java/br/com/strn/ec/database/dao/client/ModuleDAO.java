package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Module;
import org.hibernate.Session;

import javax.inject.Inject;

public class ModuleDAO extends GenericDAO<Module> {

    /**
     * @deprecated CDI eyes only
     */
    protected ModuleDAO() {
        this(null);
    }

    @Inject
    public ModuleDAO(Session session) {
        super(session);
    }
}