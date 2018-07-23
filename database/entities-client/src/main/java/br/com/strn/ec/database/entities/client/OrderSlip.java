package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "orderslip")
public class OrderSlip implements Serializable {

    private String id;
    private BigDecimal conversionRate;
    private Customer customer;
    private Orders order;
    private BigDecimal totalProductsTaxExcl;
    private BigDecimal totalProductsTaxIncl;
    private BigDecimal totalShippingTaxExcl;
    private BigDecimal totalShippingTaxIncl;
    private Boolean shippingCost;
    private BigDecimal amount;
    private BigDecimal shippingCostAmount;
    private Boolean partial;
    private Boolean orderSlipType;
    private LocalDateTime dateAdd;
    private LocalDateTime dateUpd;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(BigDecimal conversionRate) {
        this.conversionRate = conversionRate;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_customer")
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_order")
    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    public BigDecimal getTotalProductsTaxExcl() {
        return totalProductsTaxExcl;
    }

    public void setTotalProductsTaxExcl(BigDecimal totalProductsTaxExcl) {
        this.totalProductsTaxExcl = totalProductsTaxExcl;
    }

    public BigDecimal getTotalProductsTaxIncl() {
        return totalProductsTaxIncl;
    }

    public void setTotalProductsTaxIncl(BigDecimal totalProductsTaxIncl) {
        this.totalProductsTaxIncl = totalProductsTaxIncl;
    }

    public BigDecimal getTotalShippingTaxExcl() {
        return totalShippingTaxExcl;
    }

    public void setTotalShippingTaxExcl(BigDecimal totalShippingTaxExcl) {
        this.totalShippingTaxExcl = totalShippingTaxExcl;
    }

    public BigDecimal getTotalShippingTaxIncl() {
        return totalShippingTaxIncl;
    }

    public void setTotalShippingTaxIncl(BigDecimal totalShippingTaxIncl) {
        this.totalShippingTaxIncl = totalShippingTaxIncl;
    }

    public Boolean getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(Boolean shippingCost) {
        this.shippingCost = shippingCost;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getShippingCostAmount() {
        return shippingCostAmount;
    }

    public void setShippingCostAmount(BigDecimal shippingCostAmount) {
        this.shippingCostAmount = shippingCostAmount;
    }

    public Boolean getPartial() {
        return partial;
    }

    public void setPartial(Boolean partial) {
        this.partial = partial;
    }

    public Boolean getOrderSlipType() {
        return orderSlipType;
    }

    public void setOrderSlipType(Boolean orderSlipType) {
        this.orderSlipType = orderSlipType;
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