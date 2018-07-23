package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ModuleGroup;
import org.hibernate.Session;

import javax.inject.Inject;

public class ModuleGroupDAO extends GenericDAO<ModuleGroup> {

    /**
     * @deprecated CDI eyes only
     */
    protected ModuleGroupDAO() {
        this(null);
    }

    @Inject
    public ModuleGroupDAO(Session session) {
        super(session);
    }
}