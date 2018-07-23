package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.CarrierTaxRulesGroupShop;
import org.hibernate.Session;

import javax.inject.Inject;

public class CarrierTaxRulesGroupShopDAO extends GenericDAO<CarrierTaxRulesGroupShop> {

    /**
     * @deprecated CDI eyes only
     */
    protected CarrierTaxRulesGroupShopDAO() {
        this(null);
    }

    @Inject
    public CarrierTaxRulesGroupShopDAO(Session session) {
        super(session);
    }
}