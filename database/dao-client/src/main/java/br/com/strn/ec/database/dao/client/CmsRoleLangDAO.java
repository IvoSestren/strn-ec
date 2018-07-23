package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.CmsRoleLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class CmsRoleLangDAO extends GenericDAO<CmsRoleLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected CmsRoleLangDAO() {
        this(null);
    }

    @Inject
    public CmsRoleLangDAO(Session session) {
        super(session);
    }
}