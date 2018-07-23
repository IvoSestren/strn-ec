package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.SpecificPriceRuleConditionGroup;
import org.hibernate.Session;

import javax.inject.Inject;

public class SpecificPriceRuleConditionGroupDAO extends GenericDAO<SpecificPriceRuleConditionGroup> {

    /**
     * @deprecated CDI eyes only
     */
    protected SpecificPriceRuleConditionGroupDAO() {
        this(null);
    }

    @Inject
    public SpecificPriceRuleConditionGroupDAO(Session session) {
        super(session);
    }
}