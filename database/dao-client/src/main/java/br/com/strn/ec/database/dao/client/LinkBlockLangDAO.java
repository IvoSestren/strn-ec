package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.LinkBlockLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class LinkBlockLangDAO extends GenericDAO<LinkBlockLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected LinkBlockLangDAO() {
        this(null);
    }

    @Inject
    public LinkBlockLangDAO(Session session) {
        super(session);
    }
}