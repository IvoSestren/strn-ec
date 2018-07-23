package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ModuleShop;
import org.hibernate.Session;

import javax.inject.Inject;

public class ModuleShopDAO extends GenericDAO<ModuleShop> {

    /**
     * @deprecated CDI eyes only
     */
    protected ModuleShopDAO() {
        this(null);
    }

    @Inject
    public ModuleShopDAO(Session session) {
        super(session);
    }
}