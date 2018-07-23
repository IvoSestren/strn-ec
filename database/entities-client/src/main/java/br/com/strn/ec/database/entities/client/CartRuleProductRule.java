package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cartruleproductrule")
public class CartRuleProductRule implements Serializable {

    private String id;
    private CartRuleProductRuleGroup productRuleGroup;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_product_rule_group")
    public CartRuleProductRuleGroup getProductRuleGroup() {
        return productRuleGroup;
    }

    public void setProductRuleGroup(CartRuleProductRuleGroup productRuleGroup) {
        this.productRuleGroup = productRuleGroup;
    }
}