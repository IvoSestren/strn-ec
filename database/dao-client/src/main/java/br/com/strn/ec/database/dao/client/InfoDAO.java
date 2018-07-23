package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Info;
import org.hibernate.Session;

import javax.inject.Inject;

public class InfoDAO extends GenericDAO<Info> {

    /**
     * @deprecated CDI eyes only
     */
    protected InfoDAO() {
        this(null);
    }

    @Inject
    public InfoDAO(Session session) {
        super(session);
    }
}