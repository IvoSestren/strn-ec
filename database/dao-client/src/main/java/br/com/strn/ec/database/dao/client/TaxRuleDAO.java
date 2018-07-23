package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.TaxRule;
import org.hibernate.Session;

import javax.inject.Inject;

public class TaxRuleDAO extends GenericDAO<TaxRule> {

    /**
     * @deprecated CDI eyes only
     */
    protected TaxRuleDAO() {
        this(null);
    }

    @Inject
    public TaxRuleDAO(Session session) {
        super(session);
    }
}