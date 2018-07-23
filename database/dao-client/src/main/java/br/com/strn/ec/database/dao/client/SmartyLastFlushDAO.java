package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.SmartyLastFlush;
import org.hibernate.Session;

import javax.inject.Inject;

public class SmartyLastFlushDAO extends GenericDAO<SmartyLastFlush> {

    /**
     * @deprecated CDI eyes only
     */
    protected SmartyLastFlushDAO() {
        this(null);
    }

    @Inject
    public SmartyLastFlushDAO(Session session) {
        super(session);
    }
}