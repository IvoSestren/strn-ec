package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.StoreLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class StoreLangDAO extends GenericDAO<StoreLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected StoreLangDAO() {
        this(null);
    }

    @Inject
    public StoreLangDAO(Session session) {
        super(session);
    }
}