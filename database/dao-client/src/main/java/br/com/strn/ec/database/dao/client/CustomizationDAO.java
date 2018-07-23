package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Customization;
import org.hibernate.Session;

import javax.inject.Inject;

public class CustomizationDAO extends GenericDAO<Customization> {

    /**
     * @deprecated CDI eyes only
     */
    protected CustomizationDAO() {
        this(null);
    }

    @Inject
    public CustomizationDAO(Session session) {
        super(session);
    }
}