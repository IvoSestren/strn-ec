package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.TagCount;
import org.hibernate.Session;

import javax.inject.Inject;

public class TagCountDAO extends GenericDAO<TagCount> {

    /**
     * @deprecated CDI eyes only
     */
    protected TagCountDAO() {
        this(null);
    }

    @Inject
    public TagCountDAO(Session session) {
        super(session);
    }
}