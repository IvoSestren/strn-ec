package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.CmsCategory;
import org.hibernate.Session;

import javax.inject.Inject;

public class CmsCategoryDAO extends GenericDAO<CmsCategory> {

    /**
     * @deprecated CDI eyes only
     */
    protected CmsCategoryDAO() {
        this(null);
    }

    @Inject
    public CmsCategoryDAO(Session session) {
        super(session);
    }
}