package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Alias;
import org.hibernate.Session;

import javax.inject.Inject;

public class AliasDAO extends GenericDAO<Alias> {

    /**
     * @deprecated CDI eyes only
     */
    protected AliasDAO() {
        this(null);
    }

    @Inject
    public AliasDAO(Session session) {
        super(session);
    }
}