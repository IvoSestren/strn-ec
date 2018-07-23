package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "orderinvoice")
public class OrderInvoice implements Serializable {

	private String id;
    private Orders order;
    private Integer number;
    private Integer deliveryNumber;
    private LocalDateTime deliveryDate;
    private BigDecimal totalDiscountTaxExcl;
    private BigDecimal totalDiscountTaxIncl;
    private BigDecimal totalPaidTaxExcl;
    private BigDecimal totalPaidTaxIncl;
    private BigDecimal totalProducts;
    private BigDecimal totalProductsWt;
    private BigDecimal totalShippingTaxExcl;
    private BigDecimal totalShippingTaxIncl;
    private Integer shippingTaxComputationMethod;
    private BigDecimal totalWrappingTaxExcl;
    private BigDecimal totalWrappingTaxIncl;
    private String shopAddress;
    private String note;
    private LocalDateTime dateAdd;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_order")
    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getDeliveryNumber() {
        return deliveryNumber;
    }

    public void setDeliveryNumber(Integer deliveryNumber) {
        this.deliveryNumber = deliveryNumber;
    }

    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDateTime deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public BigDecimal getTotalDiscountTaxExcl() {
        return totalDiscountTaxExcl;
    }

    public void setTotalDiscountTaxExcl(BigDecimal totalDiscountTaxExcl) {
        this.totalDiscountTaxExcl = totalDiscountTaxExcl;
    }

    public BigDecimal getTotalDiscountTaxIncl() {
        return totalDiscountTaxIncl;
    }

    public void setTotalDiscountTaxIncl(BigDecimal totalDiscountTaxIncl) {
        this.totalDiscountTaxIncl = totalDiscountTaxIncl;
    }

    public BigDecimal getTotalPaidTaxExcl() {
        return totalPaidTaxExcl;
    }

    public void setTotalPaidTaxExcl(BigDecimal totalPaidTaxExcl) {
        this.totalPaidTaxExcl = totalPaidTaxExcl;
    }

    public BigDecimal getTotalPaidTaxIncl() {
        return totalPaidTaxIncl;
    }

    public void setTotalPaidTaxIncl(BigDecimal totalPaidTaxIncl) {
        this.totalPaidTaxIncl = totalPaidTaxIncl;
    }

    public BigDecimal getTotalProducts() {
        return totalProducts;
    }

    public void setTotalProducts(BigDecimal totalProducts) {
        this.totalProducts = totalProducts;
    }

    public BigDecimal getTotalProductsWt() {
        return totalProductsWt;
    }

    public void setTotalProductsWt(BigDecimal totalProductsWt) {
        this.totalProductsWt = totalProductsWt;
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

    public Integer getShippingTaxComputationMethod() {
        return shippingTaxComputationMethod;
    }

    public void setShippingTaxComputationMethod(Integer shippingTaxComputationMethod) {
        this.shippingTaxComputationMethod = shippingTaxComputationMethod;
    }

    public BigDecimal getTotalWrappingTaxExcl() {
        return totalWrappingTaxExcl;
    }

    public void setTotalWrappingTaxExcl(BigDecimal totalWrappingTaxExcl) {
        this.totalWrappingTaxExcl = totalWrappingTaxExcl;
    }

    public BigDecimal getTotalWrappingTaxIncl() {
        return totalWrappingTaxIncl;
    }

    public void setTotalWrappingTaxIncl(BigDecimal totalWrappingTaxIncl) {
        this.totalWrappingTaxIncl = totalWrappingTaxIncl;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LocalDateTime getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(LocalDateTime dateAdd) {
        this.dateAdd = dateAdd;
    }
}