package br.com.strn.ec.database.entities.client;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "imagetype")
public class ImageType implements Serializable {

    private String id;
    private String name;
    private Integer width;
    private Integer height;
    private Boolean products;
    private Boolean categories;
    private Boolean manufacturers;
    private Boolean suppliers;
    private Boolean stores;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Boolean getProducts() {
        return products;
    }

    public void setProducts(Boolean products) {
        this.products = products;
    }

    public Boolean getCategories() {
        return categories;
    }

    public void setCategories(Boolean categories) {
        this.categories = categories;
    }

    public Boolean getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(Boolean manufacturers) {
        this.manufacturers = manufacturers;
    }

    public Boolean getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(Boolean suppliers) {
        this.suppliers = suppliers;
    }

    public Boolean getStores() {
        return stores;
    }

    public void setStores(Boolean stores) {
        this.stores = stores;
    }
}