package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.CmsCategoryLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class CmsCategoryLangDAO extends GenericDAO<CmsCategoryLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected CmsCategoryLangDAO() {
        this(null);
    }

    @Inject
    public CmsCategoryLangDAO(Session session) {
        super(session);
    }
}