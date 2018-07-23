package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "productattributeimage")
public class ProductAttributeImage implements Serializable {

    private String id;
    private ProductAttribute productAttribute;
    private Image image;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_product_attribute")
    public ProductAttribute getProductAttribute() {
        return productAttribute;
    }

    public void setProductAttribute(ProductAttribute productAttribute) {
        this.productAttribute = productAttribute;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_image")
    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}