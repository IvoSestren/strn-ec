package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ModuleCarrier;
import org.hibernate.Session;

import javax.inject.Inject;

public class ModuleCarrierDAO extends GenericDAO<ModuleCarrier> {

    /**
     * @deprecated CDI eyes only
     */
    protected ModuleCarrierDAO() {
        this(null);
    }

    @Inject
    public ModuleCarrierDAO(Session session) {
        super(session);
    }
}