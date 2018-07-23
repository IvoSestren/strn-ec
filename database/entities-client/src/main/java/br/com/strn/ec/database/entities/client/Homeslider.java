package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "homeslider")
public class Homeslider implements Serializable {

    private String id;
    private HomesliderSlides homesliderSlides;
    private Shop shop;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_homeslider_slides")
    public HomesliderSlides getHomesliderSlides() {
        return homesliderSlides;
    }

    public void setHomesliderSlides(HomesliderSlides homesliderSlides) {
        this.homesliderSlides = homesliderSlides;
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