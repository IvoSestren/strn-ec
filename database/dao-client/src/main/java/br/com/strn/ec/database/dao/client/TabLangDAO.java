package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.TabLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class TabLangDAO extends GenericDAO<TabLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected TabLangDAO() {
        this(null);
    }

    @Inject
    public TabLangDAO(Session session) {
        super(session);
    }
}