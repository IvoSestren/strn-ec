package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.CustomizationField;
import org.hibernate.Session;

import javax.inject.Inject;

public class CustomizationFieldDAO extends GenericDAO<CustomizationField> {

    /**
     * @deprecated CDI eyes only
     */
    protected CustomizationFieldDAO() {
        this(null);
    }

    @Inject
    public CustomizationFieldDAO(Session session) {
        super(session);
    }
}