package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.LinkBlock;
import org.hibernate.Session;

import javax.inject.Inject;

public class LinkBlockDAO extends GenericDAO<LinkBlock> {

    /**
     * @deprecated CDI eyes only
     */
    protected LinkBlockDAO() {
        this(null);
    }

    @Inject
    public LinkBlockDAO(Session session) {
        super(session);
    }
}