package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "category")
public class Category implements Serializable {

    private String id;
    private Category parent;
    private Shop shopDefault;
    private Integer levelDepth;
    private Integer nleft;
    private Integer nright;
    private Boolean active;
    private LocalDateTime dateAdd;
    private LocalDateTime dateUpd;
    private Integer position;
    private Boolean isRootCategory;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_category")
    public Category getParent() {
        return parent;
    }

    public void setParent(Category parent) {
        this.parent = parent;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_shop_default")
    public Shop getShopDefault() {
        return shopDefault;
    }

    public void setShopDefault(Shop shopDefault) {
        this.shopDefault = shopDefault;
    }

    public Integer getLevelDepth() {
        return levelDepth;
    }

    public void setLevelDepth(Integer levelDepth) {
        this.levelDepth = levelDepth;
    }

    public Integer getNleft() {
        return nleft;
    }

    public void setNleft(Integer nleft) {
        this.nleft = nleft;
    }

    public Integer getNright() {
        return nright;
    }

    public void setNright(Integer nright) {
        this.nright = nright;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public LocalDateTime getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(LocalDateTime dateAdd) {
        this.dateAdd = dateAdd;
    }

    public LocalDateTime getDateUpd() {
        return dateUpd;
    }

    public void setDateUpd(LocalDateTime dateUpd) {
        this.dateUpd = dateUpd;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Boolean getRootCategory() {
        return isRootCategory;
    }

    public void setRootCategory(Boolean rootCategory) {
        isRootCategory = rootCategory;
    }
}