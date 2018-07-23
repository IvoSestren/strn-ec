package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.CustomizationFieldLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class CustomizationFieldLangDAO extends GenericDAO<CustomizationFieldLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected CustomizationFieldLangDAO() {
        this(null);
    }

    @Inject
    public CustomizationFieldLangDAO(Session session) {
        super(session);
    }
}