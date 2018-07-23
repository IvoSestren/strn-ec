package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.RequiredField;
import org.hibernate.Session;

import javax.inject.Inject;

public class RequiredFieldDAO extends GenericDAO<RequiredField> {

    /**
     * @deprecated CDI eyes only
     */
    protected RequiredFieldDAO() {
        this(null);
    }

    @Inject
    public RequiredFieldDAO(Session session) {
        super(session);
    }
}