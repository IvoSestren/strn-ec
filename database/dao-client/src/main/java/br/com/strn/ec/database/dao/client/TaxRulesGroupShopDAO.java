package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.TaxRulesGroupShop;
import org.hibernate.Session;

import javax.inject.Inject;

public class TaxRulesGroupShopDAO extends GenericDAO<TaxRulesGroupShop> {

    /**
     * @deprecated CDI eyes only
     */
    protected TaxRulesGroupShopDAO() {
        this(null);
    }

    @Inject
    public TaxRulesGroupShopDAO(Session session) {
        super(session);
    }
}