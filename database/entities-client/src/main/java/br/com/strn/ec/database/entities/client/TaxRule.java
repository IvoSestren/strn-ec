package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "taxrule")
public class TaxRule implements Serializable {

    private String id;
    private TaxRulesGroup taxRulesGroup;
    private Country country;
    private State state;
    private String zipcodeFrom;
    private String zipcodeTo;
    private Tax tax;
    private Integer behavior;
    private String description;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    @JoinColumn(name = "id_country")
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_state")
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getZipcodeFrom() {
        return zipcodeFrom;
    }

    public void setZipcodeFrom(String zipcodeFrom) {
        this.zipcodeFrom = zipcodeFrom;
    }

    public String getZipcodeTo() {
        return zipcodeTo;
    }

    public void setZipcodeTo(String zipcodeTo) {
        this.zipcodeTo = zipcodeTo;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tax")
    public Tax getTax() {
        return tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    public Integer getBehavior() {
        return behavior;
    }

    public void setBehavior(Integer behavior) {
        this.behavior = behavior;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}