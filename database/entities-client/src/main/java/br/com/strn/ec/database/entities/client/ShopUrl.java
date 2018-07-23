package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "shopurl")
public class ShopUrl implements Serializable {

    private String id;
    private Shop shop;
    private String domain;
    private String domainSsl;
    private String physicalUri;
    private String virtualUri;
    private Boolean main;
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

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getDomainSsl() {
        return domainSsl;
    }

    public void setDomainSsl(String domainSsl) {
        this.domainSsl = domainSsl;
    }

    public String getPhysicalUri() {
        return physicalUri;
    }

    public void setPhysicalUri(String physicalUri) {
        this.physicalUri = physicalUri;
    }

    public String getVirtualUri() {
        return virtualUri;
    }

    public void setVirtualUri(String virtualUri) {
        this.virtualUri = virtualUri;
    }

    public Boolean getMain() {
        return main;
    }

    public void setMain(Boolean main) {
        this.main = main;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}