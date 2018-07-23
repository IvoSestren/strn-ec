package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.InfoLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class InfoLangDAO extends GenericDAO<InfoLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected InfoLangDAO() {
        this(null);
    }

    @Inject
    public InfoLangDAO(Session session) {
        super(session);
    }
}