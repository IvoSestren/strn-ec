package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Hook;
import org.hibernate.Session;

import javax.inject.Inject;

public class HookDAO extends GenericDAO<Hook> {

    /**
     * @deprecated CDI eyes only
     */
    protected HookDAO() {
        this(null);
    }

    @Inject
    public HookDAO(Session session) {
        super(session);
    }
}