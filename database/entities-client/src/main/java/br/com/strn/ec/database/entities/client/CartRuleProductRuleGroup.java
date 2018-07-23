package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cartruleproductrulegroup")
public class CartRuleProductRuleGroup implements Serializable {

    private String id;
    private CartRule cartRule;
    private Integer quantity;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cart_rule")
    public CartRule getCartRule() {
        return cartRule;
    }

    public void setCartRule(CartRule cartRule) {
        this.cartRule = cartRule;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}