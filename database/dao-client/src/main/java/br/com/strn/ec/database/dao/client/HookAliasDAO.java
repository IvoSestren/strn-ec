package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.HookAlias;
import org.hibernate.Session;

import javax.inject.Inject;

public class HookAliasDAO extends GenericDAO<HookAlias> {

    /**
     * @deprecated CDI eyes only
     */
    protected HookAliasDAO() {
        this(null);
    }

    @Inject
    public HookAliasDAO(Session session) {
        super(session);
    }
}