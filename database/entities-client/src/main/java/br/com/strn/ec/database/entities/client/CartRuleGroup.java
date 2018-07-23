package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cartrulegroup")
public class CartRuleGroup implements Serializable {

    private String id;
    private CartRule cartRule;
    private Group group;

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
    @JoinColumn(name = "id_group")
    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}