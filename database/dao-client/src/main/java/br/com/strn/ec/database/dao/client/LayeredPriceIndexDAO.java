package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.LayeredPriceIndex;
import org.hibernate.Session;

import javax.inject.Inject;

public class LayeredPriceIndexDAO extends GenericDAO<LayeredPriceIndex> {

    /**
     * @deprecated CDI eyes only
     */
    protected LayeredPriceIndexDAO() {
        this(null);
    }

    @Inject
    public LayeredPriceIndexDAO(Session session) {
        super(session);
    }
}