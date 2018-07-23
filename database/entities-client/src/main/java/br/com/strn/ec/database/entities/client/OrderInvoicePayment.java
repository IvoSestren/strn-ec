package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "orderinvoicepayment")
public class OrderInvoicePayment implements Serializable {

    private String id;
    private OrderInvoice orderInvoice;
    private OrderPayment orderPayment;
    private Orders order;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_order_invoice")
    public OrderInvoice getOrderInvoice() {
        return orderInvoice;
    }

    public void setOrderInvoice(OrderInvoice orderInvoice) {
        this.orderInvoice = orderInvoice;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_order_payment")
    public OrderPayment getOrderPayment() {
        return orderPayment;
    }

    public void setOrderPayment(OrderPayment orderPayment) {
        this.orderPayment = orderPayment;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_order")
    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }
}