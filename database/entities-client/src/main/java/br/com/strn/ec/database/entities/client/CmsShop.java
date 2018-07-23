package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cmsshop")
public class CmsShop implements Serializable {

    private String id;
    private Cms cms;
    private Shop shop;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cms")
    public Cms getCms() {
        return cms;
    }

    public void setCms(Cms cms) {
        this.cms = cms;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_shop")
    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}