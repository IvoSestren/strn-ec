package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.LinksmenutopLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class LinksmenutopLangDAO extends GenericDAO<LinksmenutopLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected LinksmenutopLangDAO() {
        this(null);
    }

    @Inject
    public LinksmenutopLangDAO(Session session) {
        super(session);
    }
}