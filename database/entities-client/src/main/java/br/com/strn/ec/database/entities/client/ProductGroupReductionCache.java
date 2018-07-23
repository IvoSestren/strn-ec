package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "productgroupreductioncache")
public class ProductGroupReductionCache implements Serializable {

    private String id;
    private Product product;
    private Group group;
    private BigDecimal reduction;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_product")
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_group")
    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public BigDecimal getReduction() {
        return reduction;
    }

    public void setReduction(BigDecimal reduction) {
        this.reduction = reduction;
    }
}