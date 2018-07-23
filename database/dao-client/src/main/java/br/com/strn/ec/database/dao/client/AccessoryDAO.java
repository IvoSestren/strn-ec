package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Accessory;
import org.hibernate.Session;

import javax.inject.Inject;

public class AccessoryDAO extends GenericDAO<Accessory> {

    /**
     * @deprecated CDI eyes only
     */
    protected AccessoryDAO() {
        this(null);
    }

    @Inject
    public AccessoryDAO(Session session) {
        super(session);
    }
}