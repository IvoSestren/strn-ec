package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ManufacturerLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class ManufacturerLangDAO extends GenericDAO<ManufacturerLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected ManufacturerLangDAO() {
        this(null);
    }

    @Inject
    public ManufacturerLangDAO(Session session) {
        super(session);
    }
}