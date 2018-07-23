package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.GroupReduction;
import org.hibernate.Session;

import javax.inject.Inject;

public class GroupReductionDAO extends GenericDAO<GroupReduction> {

    /**
     * @deprecated CDI eyes only
     */
    protected GroupReductionDAO() {
        this(null);
    }

    @Inject
    public GroupReductionDAO(Session session) {
        super(session);
    }
}