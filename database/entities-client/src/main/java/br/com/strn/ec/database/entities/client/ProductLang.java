package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "productlang")
public class ProductLang implements Serializable {

    private String id;
    private Product product;
    private Shop shop;
    private Lang lang;
    private String description;
    private String descriptionShort;
    private String linkRewrite;
    private String metaDescription;
    private String metaKeywords;
    private String metaTitle;
    private String name;
    private String availableNow;
    private String availabreLater;
    private String deliveryInStock;
    private String deliveryOutStock;

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
    @JoinColumn(name = "id_shop")
    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_lang")
    public Lang getLang() {
        return lang;
    }

    public void setLang(Lang lang) {
        this.lang = lang;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescriptionShort() {
        return descriptionShort;
    }

    public void setDescriptionShort(String descriptionShort) {
        this.descriptionShort = descriptionShort;
    }

    public String getLinkRewrite() {
        return linkRewrite;
    }

    public void setLinkRewrite(String linkRewrite) {
        this.linkRewrite = linkRewrite;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    public String getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvailableNow() {
        return availableNow;
    }

    public void setAvailableNow(String availableNow) {
        this.availableNow = availableNow;
    }

    public String getAvailabreLater() {
        return availabreLater;
    }

    public void setAvailabreLater(String availabreLater) {
        this.availabreLater = availabreLater;
    }

    public String getDeliveryInStock() {
        return deliveryInStock;
    }

    public void setDeliveryInStock(String deliveryInStock) {
        this.deliveryInStock = deliveryInStock;
    }

    public String getDeliveryOutStock() {
        return deliveryOutStock;
    }

    public void setDeliveryOutStock(String deliveryOutStock) {
        this.deliveryOutStock = deliveryOutStock;
    }
}