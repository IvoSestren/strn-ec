package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.AdviceLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class AdviceLangDAO extends GenericDAO<AdviceLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected AdviceLangDAO() {
        this(null);
    }

    @Inject
    public AdviceLangDAO(Session session) {
        super(session);
    }
}