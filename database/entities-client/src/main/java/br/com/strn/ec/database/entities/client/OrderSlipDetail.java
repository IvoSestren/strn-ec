package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "orderslipdetail")
public class OrderSlipDetail implements Serializable {

	private String id;
    private OrderSlip orderSlip;
    private OrderDetail orderDetail;
    private Integer productQuantity;
    private BigDecimal unitPriceTaxExcl;
    private BigDecimal unitPriceTaxIncl;
    private BigDecimal totalPriceTaxExcl;
    private BigDecimal totalPriceTaxIncl;
    private BigDecimal amountTaxExcl;
    private BigDecimal amountTaxIncl;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_order_slip")
    public OrderSlip getOrderSlip() {
        return orderSlip;
    }

    public void setOrderSlip(OrderSlip orderSlip) {
        this.orderSlip = orderSlip;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_order_detail")
    public OrderDetail getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(OrderDetail orderDetail) {
        this.orderDetail = orderDetail;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public BigDecimal getUnitPriceTaxExcl() {
        return unitPriceTaxExcl;
    }

    public void setUnitPriceTaxExcl(BigDecimal unitPriceTaxExcl) {
        this.unitPriceTaxExcl = unitPriceTaxExcl;
    }

    public BigDecimal getUnitPriceTaxIncl() {
        return unitPriceTaxIncl;
    }

    public void setUnitPriceTaxIncl(BigDecimal unitPriceTaxIncl) {
        this.unitPriceTaxIncl = unitPriceTaxIncl;
    }

    public BigDecimal getTotalPriceTaxExcl() {
        return totalPriceTaxExcl;
    }

    public void setTotalPriceTaxExcl(BigDecimal totalPriceTaxExcl) {
        this.totalPriceTaxExcl = totalPriceTaxExcl;
    }

    public BigDecimal getTotalPriceTaxIncl() {
        return totalPriceTaxIncl;
    }

    public void setTotalPriceTaxIncl(BigDecimal totalPriceTaxIncl) {
        this.totalPriceTaxIncl = totalPriceTaxIncl;
    }

    public BigDecimal getAmountTaxExcl() {
        return amountTaxExcl;
    }

    public void setAmountTaxExcl(BigDecimal amountTaxExcl) {
        this.amountTaxExcl = amountTaxExcl;
    }

    public BigDecimal getAmountTaxIncl() {
        return amountTaxIncl;
    }

    public void setAmountTaxIncl(BigDecimal amountTaxIncl) {
        this.amountTaxIncl = amountTaxIncl;
    }
}