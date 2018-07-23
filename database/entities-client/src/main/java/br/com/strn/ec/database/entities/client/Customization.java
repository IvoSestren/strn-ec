package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "customization")
public class Customization implements Serializable {

    private String id;
    private ProductAttribute productAttribute;
    private Address addressDelivery;
    private Cart cart;
    private Product product;
    private Integer quantity;
    private Integer quantityRefunded;
    private Integer quantityReturned;
    private Boolean inCart;

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
    @JoinColumn(name = "id_address_delivery")
    public Address getAddressDelivery() {
        return addressDelivery;
    }

    public void setAddressDelivery(Address addressDelivery) {
        this.addressDelivery = addressDelivery;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cart")
    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_product")
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantityRefunded() {
        return quantityRefunded;
    }

    public void setQuantityRefunded(Integer quantityRefunded) {
        this.quantityRefunded = quantityRefunded;
    }

    public Integer getQuantityReturned() {
        return quantityReturned;
    }

    public void setQuantityReturned(Integer quantityReturned) {
        this.quantityReturned = quantityReturned;
    }

    public Boolean getInCart() {
        return inCart;
    }

    public void setInCart(Boolean inCart) {
        this.inCart = inCart;
    }
}