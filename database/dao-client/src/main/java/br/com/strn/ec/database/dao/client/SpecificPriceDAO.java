package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.SpecificPrice;
import org.hibernate.Session;

import javax.inject.Inject;

public class SpecificPriceDAO extends GenericDAO<SpecificPrice> {

    /**
     * @deprecated CDI eyes only
     */
    protected SpecificPriceDAO() {
        this(null);
    }

    @Inject
    public SpecificPriceDAO(Session session) {
        super(session);
    }
}