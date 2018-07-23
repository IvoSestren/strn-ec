package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "productsupplier")
public class ProductSupplier implements Serializable {

    private String id;
    private Product product;
    private ProductAttribute productAttribute;
    private Supplier supplier;
    private String productSupplierReference;
    private BigDecimal productSupplierPriceTe;
    private Currencies currency;

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
    @JoinColumn(name = "id_product_attribute")
    public ProductAttribute getProductAttribute() {
        return productAttribute;
    }

    public void setProductAttribute(ProductAttribute productAttribute) {
        this.productAttribute = productAttribute;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_supplier")
    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public String getProductSupplierReference() {
        return productSupplierReference;
    }

    public void setProductSupplierReference(String productSupplierReference) {
        this.productSupplierReference = productSupplierReference;
    }

    public BigDecimal getProductSupplierPriceTe() {
        return productSupplierPriceTe;
    }

    public void setProductSupplierPriceTe(BigDecimal productSupplierPriceTe) {
        this.productSupplierPriceTe = productSupplierPriceTe;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_currency")
    public Currencies getCurrency() {
        return currency;
    }

    public void setCurrency(Currencies currency) {
        this.currency = currency;
    }
}