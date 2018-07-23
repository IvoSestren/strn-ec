package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "accessory")
public class Accessory implements Serializable {

	private String id;
    private Product product1;
    private Product product2;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_product1")
    public Product getProduct1() {
        return product1;
    }

    public void setProduct1(Product product1) {
        this.product1 = product1;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_product2")
    public Product getProduct2() {
        return product2;
    }

    public void setProduct2(Product product2) {
        this.product2 = product2;
    }
}