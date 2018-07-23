package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.RiskLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class RiskLangDAO extends GenericDAO<RiskLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected RiskLangDAO() {
        this(null);
    }

    @Inject
    public RiskLangDAO(Session session) {
        super(session);
    }
}