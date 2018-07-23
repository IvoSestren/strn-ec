package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "orderreturnstatelang")
public class OrderReturnStateLang implements Serializable {

    private String id;
    private OrderReturnState orderReturnState;
    private Lang lang;
    private String name;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_order_return_state")
    public OrderReturnState getOrderReturnState() {
        return orderReturnState;
    }

    public void setOrderReturnState(OrderReturnState orderReturnState) {
        this.orderReturnState = orderReturnState;
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
}