package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ordermessagelang")
public class OrderMessageLang implements Serializable {

    private String id;
    private OrderMessage orderMessage;
    private Lang lang;
    private String name;
    private String message;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_order_message")
    public OrderMessage getOrderMessage() {
        return orderMessage;
    }

    public void setOrderMessage(OrderMessage orderMessage) {
        this.orderMessage = orderMessage;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}