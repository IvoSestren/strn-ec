package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "cartrule")
public class CartRule implements Serializable {

    private String id;
    private Customer customer;
    private LocalDateTime dateFrom;
    private LocalDateTime dateTo;
    private String description;
    private Integer quantity;
    private Integer quantityPerUser;
    private Integer priority;
    private Boolean partialUse;
    private String code;
    private BigDecimal minimalAmount;
    private Boolean minimalAmountTax;
    private Integer minimalAmountCurrency;
    private Boolean minimalAmountShipping;
    private Boolean countryRestriction;
    private Boolean carrierRestriction;
    private Boolean groupRestriction;
    private Boolean cartRuleRestriction;
    private Boolean productRestriction;
    private Boolean shopRestriction;
    private Boolean freeShipping;
    private BigDecimal reductionPercent;
    private BigDecimal reductionAmount;
    private Boolean reductionTax;
    private Integer reductionCurrency;
    private Integer reductionProduct;
    private Boolean reductionExcludeSpecial;
    private Product giftProduct;
    private ProductAttribute giftProductAttribute;
    private Boolean highlight;
    private Boolean active;
    private LocalDateTime dateAdd;
    private LocalDateTime dateUpd;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_customer")
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDateTime getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDateTime dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDateTime getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDateTime dateTo) {
        this.dateTo = dateTo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantityPerUser() {
        return quantityPerUser;
    }

    public void setQuantityPerUser(Integer quantityPerUser) {
        this.quantityPerUser = quantityPerUser;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Boolean getPartialUse() {
        return partialUse;
    }

    public void setPartialUse(Boolean partialUse) {
        this.partialUse = partialUse;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getMinimalAmount() {
        return minimalAmount;
    }

    public void setMinimalAmount(BigDecimal minimalAmount) {
        this.minimalAmount = minimalAmount;
    }

    public Boolean getMinimalAmountTax() {
        return minimalAmountTax;
    }

    public void setMinimalAmountTax(Boolean minimalAmountTax) {
        this.minimalAmountTax = minimalAmountTax;
    }

    public Integer getMinimalAmountCurrency() {
        return minimalAmountCurrency;
    }

    public void setMinimalAmountCurrency(Integer minimalAmountCurrency) {
        this.minimalAmountCurrency = minimalAmountCurrency;
    }

    public Boolean getMinimalAmountShipping() {
        return minimalAmountShipping;
    }

    public void setMinimalAmountShipping(Boolean minimalAmountShipping) {
        this.minimalAmountShipping = minimalAmountShipping;
    }

    public Boolean getCountryRestriction() {
        return countryRestriction;
    }

    public void setCountryRestriction(Boolean countryRestriction) {
        this.countryRestriction = countryRestriction;
    }

    public Boolean getCarrierRestriction() {
        return carrierRestriction;
    }

    public void setCarrierRestriction(Boolean carrierRestriction) {
        this.carrierRestriction = carrierRestriction;
    }

    public Boolean getGroupRestriction() {
        return groupRestriction;
    }

    public void setGroupRestriction(Boolean groupRestriction) {
        this.groupRestriction = groupRestriction;
    }

    public Boolean getCartRuleRestriction() {
        return cartRuleRestriction;
    }

    public void setCartRuleRestriction(Boolean cartRuleRestriction) {
        this.cartRuleRestriction = cartRuleRestriction;
    }

    public Boolean getProductRestriction() {
        return productRestriction;
    }

    public void setProductRestriction(Boolean productRestriction) {
        this.productRestriction = productRestriction;
    }

    public Boolean getShopRestriction() {
        return shopRestriction;
    }

    public void setShopRestriction(Boolean shopRestriction) {
        this.shopRestriction = shopRestriction;
    }

    public Boolean getFreeShipping() {
        return freeShipping;
    }

    public void setFreeShipping(Boolean freeShipping) {
        this.freeShipping = freeShipping;
    }

    public BigDecimal getReductionPercent() {
        return reductionPercent;
    }

    public void setReductionPercent(BigDecimal reductionPercent) {
        this.reductionPercent = reductionPercent;
    }

    public BigDecimal getReductionAmount() {
        return reductionAmount;
    }

    public void setReductionAmount(BigDecimal reductionAmount) {
        this.reductionAmount = reductionAmount;
    }

    public Boolean getReductionTax() {
        return reductionTax;
    }

    public void setReductionTax(Boolean reductionTax) {
        this.reductionTax = reductionTax;
    }

    public Integer getReductionCurrency() {
        return reductionCurrency;
    }

    public void setReductionCurrency(Integer reductionCurrency) {
        this.reductionCurrency = reductionCurrency;
    }

    public Integer getReductionProduct() {
        return reductionProduct;
    }

    public void setReductionProduct(Integer reductionProduct) {
        this.reductionProduct = reductionProduct;
    }

    public Boolean getReductionExcludeSpecial() {
        return reductionExcludeSpecial;
    }

    public void setReductionExcludeSpecial(Boolean reductionExcludeSpecial) {
        this.reductionExcludeSpecial = reductionExcludeSpecial;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_product_gift")
    public Product getGiftProduct() {
        return giftProduct;
    }

    public void setGiftProduct(Product giftProduct) {
        this.giftProduct = giftProduct;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_product_attribute_gift")
    public ProductAttribute getGiftProductAttribute() {
        return giftProductAttribute;
    }

    public void setGiftProductAttribute(ProductAttribute giftProductAttribute) {
        this.giftProductAttribute = giftProductAttribute;
    }

    public Boolean getHighlight() {
        return highlight;
    }

    public void setHighlight(Boolean highlight) {
        this.highlight = highlight;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public LocalDateTime getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(LocalDateTime dateAdd) {
        this.dateAdd = dateAdd;
    }

    public LocalDateTime getDateUpd() {
        return dateUpd;
    }

    public void setDateUpd(LocalDateTime dateUpd) {
        this.dateUpd = dateUpd;
    }
}