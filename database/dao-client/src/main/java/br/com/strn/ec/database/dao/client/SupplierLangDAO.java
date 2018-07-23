package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.SupplierLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class SupplierLangDAO extends GenericDAO<SupplierLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected SupplierLangDAO() {
        this(null);
    }

    @Inject
    public SupplierLangDAO(Session session) {
        super(session);
    }
}