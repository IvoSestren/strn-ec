package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Tax;
import org.hibernate.Session;

import javax.inject.Inject;

public class TaxDAO extends GenericDAO<Tax> {

    /**
     * @deprecated CDI eyes only
     */
    protected TaxDAO() {
        this(null);
    }

    @Inject
    public TaxDAO(Session session) {
        super(session);
    }
}