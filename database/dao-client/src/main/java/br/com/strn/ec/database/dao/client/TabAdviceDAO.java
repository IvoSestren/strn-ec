package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.TabAdvice;
import org.hibernate.Session;

import javax.inject.Inject;

public class TabAdviceDAO extends GenericDAO<TabAdvice> {

    /**
     * @deprecated CDI eyes only
     */
    protected TabAdviceDAO() {
        this(null);
    }

    @Inject
    public TabAdviceDAO(Session session) {
        super(session);
    }
}