package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.OrderStateLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class OrderStateLangDAO extends GenericDAO<OrderStateLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected OrderStateLangDAO() {
        this(null);
    }

    @Inject
    public OrderStateLangDAO(Session session) {
        super(session);
    }
}