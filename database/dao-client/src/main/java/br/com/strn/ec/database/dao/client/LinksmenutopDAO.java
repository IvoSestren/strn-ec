package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Linksmenutop;
import org.hibernate.Session;

import javax.inject.Inject;

public class LinksmenutopDAO extends GenericDAO<Linksmenutop> {

    /**
     * @deprecated CDI eyes only
     */
    protected LinksmenutopDAO() {
        this(null);
    }

    @Inject
    public LinksmenutopDAO(Session session) {
        super(session);
    }
}