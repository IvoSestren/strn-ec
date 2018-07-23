package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "ordercartrule")
public class OrderCartRule implements Serializable {

    private String id;
    private Orders order;
    private CartRule cartRule;
    private OrderInvoice orderInvoice;
    private String name;
    private BigDecimal value;
    private BigDecimal valueTaxExcl;
    private Boolean freeShipping;

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
    @JoinColumn(name = "id_cart_rule")
    public CartRule getCartRule() {
        return cartRule;
    }

    public void setCartRule(CartRule cartRule) {
        this.cartRule = cartRule;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_order_invoice")
    public OrderInvoice getOrderInvoice() {
        return orderInvoice;
    }

    public void setOrderInvoice(OrderInvoice orderInvoice) {
        this.orderInvoice = orderInvoice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValueTaxExcl() {
        return valueTaxExcl;
    }

    public void setValueTaxExcl(BigDecimal valueTaxExcl) {
        this.valueTaxExcl = valueTaxExcl;
    }

    public Boolean getFreeShipping() {
        return freeShipping;
    }

    public void setFreeShipping(Boolean freeShipping) {
        this.freeShipping = freeShipping;
    }
}