package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "ordercarrier")
public class OrderCarrier implements Serializable {

    private String id;
    private Orders order;
    private Carrier carrier;
    private OrderInvoice orderInvoice;
    private BigDecimal weight;
    private BigDecimal shippingCostTaxExcl;
    private BigDecimal shippingCostTaxIncl;
    private String trackingNumber;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_carrier")
    public Carrier getCarrier() {
        return carrier;
    }

    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_order_invoice")
    public OrderInvoice getOrderInvoice() {
        return orderInvoice;
    }

    public void setOrderInvoice(OrderInvoice orderInvoice) {
        this.orderInvoice = orderInvoice;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getShippingCostTaxExcl() {
        return shippingCostTaxExcl;
    }

    public void setShippingCostTaxExcl(BigDecimal shippingCostTaxExcl) {
        this.shippingCostTaxExcl = shippingCostTaxExcl;
    }

    public BigDecimal getShippingCostTaxIncl() {
        return shippingCostTaxIncl;
    }

    public void setShippingCostTaxIncl(BigDecimal shippingCostTaxIncl) {
        this.shippingCostTaxIncl = shippingCostTaxIncl;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public LocalDateTime getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(LocalDateTime dateAdd) {
        this.dateAdd = dateAdd;
    }
}