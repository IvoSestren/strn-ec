package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "specificpriceruleconditiongroup")
public class SpecificPriceRuleConditionGroup implements Serializable {

    private String id;
    private SpecificPriceRule specificPriceRule;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_specific_price_rule")
    public SpecificPriceRule getSpecificPriceRule() {
        return specificPriceRule;
    }

    public void setSpecificPriceRule(SpecificPriceRule specificPriceRule) {
        this.specificPriceRule = specificPriceRule;
    }
}