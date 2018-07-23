package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.SearchWord;
import org.hibernate.Session;

import javax.inject.Inject;

public class SearchWordDAO extends GenericDAO<SearchWord> {

    /**
     * @deprecated CDI eyes only
     */
    protected SearchWordDAO() {
        this(null);
    }

    @Inject
    public SearchWordDAO(Session session) {
        super(session);
    }
}