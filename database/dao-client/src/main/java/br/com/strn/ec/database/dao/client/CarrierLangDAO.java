package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.CarrierLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class CarrierLangDAO extends GenericDAO<CarrierLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected CarrierLangDAO() {
        this(null);
    }

    @Inject
    public CarrierLangDAO(Session session) {
        super(session);
    }
}