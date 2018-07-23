package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cartruleproductrulevalue")
public class CartRuleProductRuleValue implements Serializable {

    private String id;
    private CartRuleProductRule productRule;
    private Pack item;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_product_rule")
    public CartRuleProductRule getProductRule() {
        return productRule;
    }

    public void setProductRule(CartRuleProductRule productRule) {
        this.productRule = productRule;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_item")
    public Pack getItem() {
        return item;
    }

    public void setItem(Pack item) {
        this.item = item;
    }
}