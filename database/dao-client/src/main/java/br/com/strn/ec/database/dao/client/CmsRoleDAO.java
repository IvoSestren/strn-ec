package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.CmsRole;
import org.hibernate.Session;

import javax.inject.Inject;

public class CmsRoleDAO extends GenericDAO<CmsRole> {

    /**
     * @deprecated CDI eyes only
     */
    protected CmsRoleDAO() {
        this(null);
    }

    @Inject
    public CmsRoleDAO(Session session) {
        super(session);
    }
}