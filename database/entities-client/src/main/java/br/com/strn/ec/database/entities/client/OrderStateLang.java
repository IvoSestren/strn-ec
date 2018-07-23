package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "orderstatelang")
public class OrderStateLang implements Serializable {

    private String id;
    private OrderState orderState;
    private Lang lang;
    private String name;
    private String template;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_order_state")
    public OrderState getOrderState() {
        return orderState;
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_lang")
    public Lang getLang() {
        return lang;
    }

    public void setLang(Lang lang) {
        this.lang = lang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }
}