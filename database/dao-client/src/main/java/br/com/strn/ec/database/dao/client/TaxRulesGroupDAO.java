package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.TaxRulesGroup;
import org.hibernate.Session;

import javax.inject.Inject;

public class TaxRulesGroupDAO extends GenericDAO<TaxRulesGroup> {

    /**
     * @deprecated CDI eyes only
     */
    protected TaxRulesGroupDAO() {
        this(null);
    }

    @Inject
    public TaxRulesGroupDAO(Session session) {
        super(session);
    }
}