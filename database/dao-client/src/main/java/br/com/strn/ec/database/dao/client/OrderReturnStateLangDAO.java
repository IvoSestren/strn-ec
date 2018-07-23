package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.OrderReturnStateLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class OrderReturnStateLangDAO extends GenericDAO<OrderReturnStateLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected OrderReturnStateLangDAO() {
        this(null);
    }

    @Inject
    public OrderReturnStateLangDAO(Session session) {
        super(session);
    }
}