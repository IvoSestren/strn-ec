package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "delivery")
public class Delivery implements Serializable {

    private String id;
    private Shop shop;
    private ShopGroup shopGroup;
    private Carrier carrier;
    private RangePrice rangePrice;
    private RangeWeight rangeWeight;
    private Zone zone;
    private BigDecimal price;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_carrier")
    public Carrier getCarrier() {
        return carrier;
    }

    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_range_price")
    public RangePrice getRangePrice() {
        return rangePrice;
    }

    public void setRangePrice(RangePrice rangePrice) {
        this.rangePrice = rangePrice;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_range_weight")
    public RangeWeight getRangeWeight() {
        return rangeWeight;
    }

    public void setRangeWeight(RangeWeight rangeWeight) {
        this.rangeWeight = rangeWeight;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_zone")
    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}