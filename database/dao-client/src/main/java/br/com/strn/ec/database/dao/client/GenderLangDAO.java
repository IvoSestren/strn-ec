package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.GenderLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class GenderLangDAO extends GenericDAO<GenderLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected GenderLangDAO() {
        this(null);
    }

    @Inject
    public GenderLangDAO(Session session) {
        super(session);
    }
}