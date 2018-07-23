package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.TabModulePreference;
import org.hibernate.Session;

import javax.inject.Inject;

public class TabModulePreferenceDAO extends GenericDAO<TabModulePreference> {

    /**
     * @deprecated CDI eyes only
     */
    protected TabModulePreferenceDAO() {
        this(null);
    }

    @Inject
    public TabModulePreferenceDAO(Session session) {
        super(session);
    }
}