package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Advice;
import org.hibernate.Session;

import javax.inject.Inject;

public class AdviceDAO extends GenericDAO<Advice> {

    /**
     * @deprecated CDI eyes only
     */
    protected AdviceDAO() {
        this(null);
    }

    @Inject
    public AdviceDAO(Session session) {
        super(session);
    }
}