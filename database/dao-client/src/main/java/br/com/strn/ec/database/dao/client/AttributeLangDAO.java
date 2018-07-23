package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.AttributeLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class AttributeLangDAO extends GenericDAO<AttributeLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected AttributeLangDAO() {
        this(null);
    }

    @Inject
    public AttributeLangDAO(Session session) {
        super(session);
    }
}