package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.SpecificPriceRule;
import org.hibernate.Session;

import javax.inject.Inject;

public class SpecificPriceRuleDAO extends GenericDAO<SpecificPriceRule> {

    /**
     * @deprecated CDI eyes only
     */
    protected SpecificPriceRuleDAO() {
        this(null);
    }

    @Inject
    public SpecificPriceRuleDAO(Session session) {
        super(session);
    }
}