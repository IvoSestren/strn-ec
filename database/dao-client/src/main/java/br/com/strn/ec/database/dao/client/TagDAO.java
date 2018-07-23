package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Tag;
import org.hibernate.Session;

import javax.inject.Inject;

public class TagDAO extends GenericDAO<Tag> {

    /**
     * @deprecated CDI eyes only
     */
    protected TagDAO() {
        this(null);
    }

    @Inject
    public TagDAO(Session session) {
        super(session);
    }
}