package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.QuickAccessLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class QuickAccessLangDAO extends GenericDAO<QuickAccessLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected QuickAccessLangDAO() {
        this(null);
    }

    @Inject
    public QuickAccessLangDAO(Session session) {
        super(session);
    }
}