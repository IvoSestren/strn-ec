package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "specificpricerulecondition")
public class SpecificPriceRuleCondition implements Serializable {

    private String id;
    private SpecificPriceRuleConditionGroup specificPriceRuleConditionGroup;
    private String type;
    private String value;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_specific_price_rule_condition_group")
    public SpecificPriceRuleConditionGroup getSpecificPriceRuleConditionGroup() {
        return specificPriceRuleConditionGroup;
    }

    public void setSpecificPriceRuleConditionGroup(SpecificPriceRuleConditionGroup specificPriceRuleConditionGroup) {
        this.specificPriceRuleConditionGroup = specificPriceRuleConditionGroup;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}