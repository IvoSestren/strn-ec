package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cmscategoryshop")
public class CmsCategoryShop implements Serializable {

    private String id;
    private CmsCategory cmsCategory;
    private Shop shop;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cms_category")
    public CmsCategory getCmsCategory() {
        return cmsCategory;
    }

    public void setCmsCategory(CmsCategory cmsCategory) {
        this.cmsCategory = cmsCategory;
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