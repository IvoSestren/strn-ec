package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.SupplyOrderStateLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class SupplyOrderStateLangDAO extends GenericDAO<SupplyOrderStateLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected SupplyOrderStateLangDAO() {
        this(null);
    }

    @Inject
    public SupplyOrderStateLangDAO(Session session) {
        super(session);
    }
}