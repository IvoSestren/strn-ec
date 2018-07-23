package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "carriertaxrulesgroupshop")
public class CarrierTaxRulesGroupShop implements Serializable {

    private String id;
    private Carrier carrier;
    private TaxRulesGroup taxRulesGroup;
    private Shop shop;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_carrier")
    public Carrier getCarrier() {
        return carrier;
    }

    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tax_rules_group")
    public TaxRulesGroup getTaxRulesGroup() {
        return taxRulesGroup;
    }

    public void setTaxRulesGroup(TaxRulesGroup taxRulesGroup) {
        this.taxRulesGroup = taxRulesGroup;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_shop")
    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}