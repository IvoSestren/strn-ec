package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ModuleAccess;
import org.hibernate.Session;

import javax.inject.Inject;

public class ModuleAccessDAO extends GenericDAO<ModuleAccess> {

    /**
     * @deprecated CDI eyes only
     */
    protected ModuleAccessDAO() {
        this(null);
    }

    @Inject
    public ModuleAccessDAO(Session session) {
        super(session);
    }
}