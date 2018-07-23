package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Cms;
import org.hibernate.Session;

import javax.inject.Inject;

public class CmsDAO extends GenericDAO<Cms> {

    /**
     * @deprecated CDI eyes only
     */
    protected CmsDAO() {
        this(null);
    }

    @Inject
    public CmsDAO(Session session) {
        super(session);
    }
}