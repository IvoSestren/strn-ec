package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Meta;
import org.hibernate.Session;

import javax.inject.Inject;

public class MetaDAO extends GenericDAO<Meta> {

    /**
     * @deprecated CDI eyes only
     */
    protected MetaDAO() {
        this(null);
    }

    @Inject
    public MetaDAO(Session session) {
        super(session);
    }
}