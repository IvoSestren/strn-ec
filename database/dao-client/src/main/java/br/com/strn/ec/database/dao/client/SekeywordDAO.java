package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Sekeyword;
import org.hibernate.Session;

import javax.inject.Inject;

public class SekeywordDAO extends GenericDAO<Sekeyword> {

    /**
     * @deprecated CDI eyes only
     */
    protected SekeywordDAO() {
        this(null);
    }

    @Inject
    public SekeywordDAO(Session session) {
        super(session);
    }
}