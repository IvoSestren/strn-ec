package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ReassuranceLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class ReassuranceLangDAO extends GenericDAO<ReassuranceLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected ReassuranceLangDAO() {
        this(null);
    }

    @Inject
    public ReassuranceLangDAO(Session session) {
        super(session);
    }
}