package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "orderinvoicetax")
public class OrderInvoiceTax implements Serializable {

	private String id;
    private OrderInvoice orderInvoice;
    private String type;
    private Tax tax;
    private BigDecimal amount;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tax")
    public Tax getTax() {
        return tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}