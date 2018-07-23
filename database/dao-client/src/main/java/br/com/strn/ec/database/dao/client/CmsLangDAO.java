package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.CmsLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class CmsLangDAO extends GenericDAO<CmsLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected CmsLangDAO() {
        this(null);
    }

    @Inject
    public CmsLangDAO(Session session) {
        super(session);
    }
}