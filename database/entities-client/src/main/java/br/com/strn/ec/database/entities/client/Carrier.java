package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "carrier")
public class Carrier implements Serializable {

    private String id;
    private Carrier reference;
    private TaxRulesGroup taxRulesGroup;
    private String name;
    private String url;
    private Boolean active;
    private Boolean deleted;
    private Boolean shippingHandling;
    private Boolean rangeBehavior;
    private Boolean isModule;
    private Boolean isFree;
    private Boolean shippingExternal;
    private Boolean needRange;
    private String externalModuleName;
    private Integer shippingMethod;
    private Integer position;
    private Integer maxWidth;
    private Integer maxHeight;
    private Integer maxDepth;
    private BigDecimal maxWeight;
    private Integer grade;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_reference")
    public Carrier getReference() {
        return reference;
    }

    public void setReference(Carrier reference) {
        this.reference = reference;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tax_rules_group")
    public TaxRulesGroup getTaxRulesGroup() {
        return taxRulesGroup;
    }

    public void setTaxRulesGroup(TaxRulesGroup taxRulesGroup) {
        this.taxRulesGroup = taxRulesGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Boolean getShippingHandling() {
        return shippingHandling;
    }

    public void setShippingHandling(Boolean shippingHandling) {
        this.shippingHandling = shippingHandling;
    }

    public Boolean getRangeBehavior() {
        return rangeBehavior;
    }

    public void setRangeBehavior(Boolean rangeBehavior) {
        this.rangeBehavior = rangeBehavior;
    }

    public Boolean getModule() {
        return isModule;
    }

    public void setModule(Boolean module) {
        isModule = module;
    }

    public Boolean getFree() {
        return isFree;
    }

    public void setFree(Boolean free) {
        isFree = free;
    }

    public Boolean getShippingExternal() {
        return shippingExternal;
    }

    public void setShippingExternal(Boolean shippingExternal) {
        this.shippingExternal = shippingExternal;
    }

    public Boolean getNeedRange() {
        return needRange;
    }

    public void setNeedRange(Boolean needRange) {
        this.needRange = needRange;
    }

    public String getExternalModuleName() {
        return externalModuleName;
    }

    public void setExternalModuleName(String externalModuleName) {
        this.externalModuleName = externalModuleName;
    }

    public Integer getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(Integer shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getMaxWidth() {
        return maxWidth;
    }

    public void setMaxWidth(Integer maxWidth) {
        this.maxWidth = maxWidth;
    }

    public Integer getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(Integer maxHeight) {
        this.maxHeight = maxHeight;
    }

    public Integer getMaxDepth() {
        return maxDepth;
    }

    public void setMaxDepth(Integer maxDepth) {
        this.maxDepth = maxDepth;
    }

    public BigDecimal getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(BigDecimal maxWeight) {
        this.maxWeight = maxWeight;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}