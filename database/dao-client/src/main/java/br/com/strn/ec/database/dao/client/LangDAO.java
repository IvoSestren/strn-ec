package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Lang;
import org.hibernate.Session;

import javax.inject.Inject;

public class LangDAO extends GenericDAO<Lang> {

    /**
     * @deprecated CDI eyes only
     */
    protected LangDAO() {
        this(null);
    }

    @Inject
    public LangDAO(Session session) {
        super(session);
    }
}