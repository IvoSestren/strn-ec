package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.SearchIndex;
import org.hibernate.Session;

import javax.inject.Inject;

public class SearchIndexDAO extends GenericDAO<SearchIndex> {

    /**
     * @deprecated CDI eyes only
     */
    protected SearchIndexDAO() {
        this(null);
    }

    @Inject
    public SearchIndexDAO(Session session) {
        super(session);
    }
}