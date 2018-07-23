package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ModulePreference;
import org.hibernate.Session;

import javax.inject.Inject;

public class ModulePreferenceDAO extends GenericDAO<ModulePreference> {

    /**
     * @deprecated CDI eyes only
     */
    protected ModulePreferenceDAO() {
        this(null);
    }

    @Inject
    public ModulePreferenceDAO(Session session) {
        super(session);
    }
}