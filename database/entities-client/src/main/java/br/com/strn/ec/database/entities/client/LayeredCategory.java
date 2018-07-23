package br.com.strn.ec.database.entities.client;

import br.com.strn.ec.database.entities.client.enums.LayeredCategoryType;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "layeredcategory")
public class LayeredCategory implements Serializable {

    private String id;
    private Shop shop;
    private Category category;
    private LayeredCategoryType type;
    private Integer position;
    private Integer filterType;
    private Integer filterShowLimit;

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
    @JoinColumn(name = "id_category")
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Enumerated(EnumType.STRING)
    public LayeredCategoryType getType() {
        return type;
    }

    public void setType(LayeredCategoryType type) {
        this.type = type;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getFilterType() {
        return filterType;
    }

    public void setFilterType(Integer filterType) {
        this.filterType = filterType;
    }

    public Integer getFilterShowLimit() {
        return filterShowLimit;
    }

    public void setFilterShowLimit(Integer filterShowLimit) {
        this.filterShowLimit = filterShowLimit;
    }
}