package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cartrulecombination")
public class CartRuleCombination implements Serializable {

    private String id;
    private CartRule cartRule1;
    private CartRule cartRule2;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cart_rule_1")
    public CartRule getCartRule1() {
        return cartRule1;
    }

    public void setCartRule1(CartRule cartRule1) {
        this.cartRule1 = cartRule1;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cart_rule_2")
    public CartRule getCartRule2() {
        return cartRule2;
    }

    public void setCartRule2(CartRule cartRule2) {
        this.cartRule2 = cartRule2;
    }
}