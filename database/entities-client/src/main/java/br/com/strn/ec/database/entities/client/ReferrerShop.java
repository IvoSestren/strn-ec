package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "referrershop")
public class ReferrerShop implements Serializable {

    private String id;
    private Referrer referrer;
    private Shop shop;
    private Integer cacheVisitors;
    private Integer cacheVisits;
    private Integer cachePages;
    private Integer cacheRegistrations;
    private Integer cacheOrders;
    private BigDecimal cacheSales;
    private BigDecimal cacheRedRate;
    private BigDecimal cacheOrderRate;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_referrer")
    public Referrer getReferrer() {
        return referrer;
    }

    public void setReferrer(Referrer referrer) {
        this.referrer = referrer;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_shop")
    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Integer getCacheVisitors() {
        return cacheVisitors;
    }

    public void setCacheVisitors(Integer cacheVisitors) {
        this.cacheVisitors = cacheVisitors;
    }

    public Integer getCacheVisits() {
        return cacheVisits;
    }

    public void setCacheVisits(Integer cacheVisits) {
        this.cacheVisits = cacheVisits;
    }

    public Integer getCachePages() {
        return cachePages;
    }

    public void setCachePages(Integer cachePages) {
        this.cachePages = cachePages;
    }

    public Integer getCacheRegistrations() {
        return cacheRegistrations;
    }

    public void setCacheRegistrations(Integer cacheRegistrations) {
        this.cacheRegistrations = cacheRegistrations;
    }

    public Integer getCacheOrders() {
        return cacheOrders;
    }

    public void setCacheOrders(Integer cacheOrders) {
        this.cacheOrders = cacheOrders;
    }

    public BigDecimal getCacheSales() {
        return cacheSales;
    }

    public void setCacheSales(BigDecimal cacheSales) {
        this.cacheSales = cacheSales;
    }

    public BigDecimal getCacheRedRate() {
        return cacheRedRate;
    }

    public void setCacheRedRate(BigDecimal cacheRedRate) {
        this.cacheRedRate = cacheRedRate;
    }

    public BigDecimal getCacheOrderRate() {
        return cacheOrderRate;
    }

    public void setCacheOrderRate(BigDecimal cacheOrderRate) {
        this.cacheOrderRate = cacheOrderRate;
    }
}