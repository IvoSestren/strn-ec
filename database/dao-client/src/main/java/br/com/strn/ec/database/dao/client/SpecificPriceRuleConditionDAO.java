package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.SpecificPriceRuleCondition;
import org.hibernate.Session;

import javax.inject.Inject;

public class SpecificPriceRuleConditionDAO extends GenericDAO<SpecificPriceRuleCondition> {

    /**
     * @deprecated CDI eyes only
     */
    protected SpecificPriceRuleConditionDAO() {
        this(null);
    }

    @Inject
    public SpecificPriceRuleConditionDAO(Session session) {
        super(session);
    }
}