package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "layeredfiltershop")
public class LayeredFilterShop implements Serializable {

    private String id;
    private LayeredFilter layeredFilter;
    private Shop shop;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_layered_filter")
    public LayeredFilter getLayeredFilter() {
        return layeredFilter;
    }

    public void setLayeredFilter(LayeredFilter layeredFilter) {
        this.layeredFilter = layeredFilter;
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