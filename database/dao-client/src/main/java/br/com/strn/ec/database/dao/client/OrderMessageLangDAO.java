package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.OrderMessageLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class OrderMessageLangDAO extends GenericDAO<OrderMessageLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected OrderMessageLangDAO() {
        this(null);
    }

    @Inject
    public OrderMessageLangDAO(Session session) {
        super(session);
    }
}