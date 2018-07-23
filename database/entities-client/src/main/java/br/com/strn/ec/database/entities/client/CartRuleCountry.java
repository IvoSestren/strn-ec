package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cartrulecountry")
public class CartRuleCountry implements Serializable {

    String id;
    CartRule cartRule;
    Country country;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_country")
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}