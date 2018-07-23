package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.SearchEngine;
import org.hibernate.Session;

import javax.inject.Inject;

public class SearchEngineDAO extends GenericDAO<SearchEngine> {

    /**
     * @deprecated CDI eyes only
     */
    protected SearchEngineDAO() {
        this(null);
    }

    @Inject
    public SearchEngineDAO(Session session) {
        super(session);
    }
}