package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "emailsubscription")
public class Emailsubscription implements Serializable {

    private String id;
    private Shop shop;
    private ShopGroup shopGroup;
    private String email;
    private LocalDateTime newsletterDateAdd;
    private String ipRegistrationNewsletter;
    private String httpReferer;
    private Boolean active;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    @JoinColumn(name = "id_shop_group")
    public ShopGroup getShopGroup() {
        return shopGroup;
    }

    public void setShopGroup(ShopGroup shopGroup) {
        this.shopGroup = shopGroup;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getNewsletterDateAdd() {
        return newsletterDateAdd;
    }

    public void setNewsletterDateAdd(LocalDateTime newsletterDateAdd) {
        this.newsletterDateAdd = newsletterDateAdd;
    }

    public String getIpRegistrationNewsletter() {
        return ipRegistrationNewsletter;
    }

    public void setIpRegistrationNewsletter(String ipRegistrationNewsletter) {
        this.ipRegistrationNewsletter = ipRegistrationNewsletter;
    }

    public String getHttpReferer() {
        return httpReferer;
    }

    public void setHttpReferer(String httpReferer) {
        this.httpReferer = httpReferer;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}