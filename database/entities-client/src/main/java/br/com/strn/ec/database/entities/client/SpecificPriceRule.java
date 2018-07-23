package br.com.strn.ec.database.entities.client;

import br.com.strn.ec.database.entities.client.enums.SpecificPriceRuleReductionType;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "specificpricerule")
public class SpecificPriceRule implements Serializable {

    private String id;
    private String name;
    private Shop shop;
    private Currencies currency;
    private Country country;
    private Group group;
    private Integer fromQuantity;
    private BigDecimal price;
    private BigDecimal reduction;
    private BigDecimal reductionTax;
    private SpecificPriceRuleReductionType reductionType;
    private LocalDateTime from;
    private LocalDateTime to;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @JoinColumn(name = "id_currency")
    public Currencies getCurrency() {
        return currency;
    }

    public void setCurrency(Currencies currency) {
        this.currency = currency;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_country")
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_group")
    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Integer getFromQuantity() {
        return fromQuantity;
    }

    public void setFromQuantity(Integer fromQuantity) {
        this.fromQuantity = fromQuantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getReduction() {
        return reduction;
    }

    public void setReduction(BigDecimal reduction) {
        this.reduction = reduction;
    }

    public BigDecimal getReductionTax() {
        return reductionTax;
    }

    public void setReductionTax(BigDecimal reductionTax) {
        this.reductionTax = reductionTax;
    }

    @Enumerated(EnumType.STRING)
    public SpecificPriceRuleReductionType getReductionType() {
        return reductionType;
    }

    public void setReductionType(SpecificPriceRuleReductionType reductionType) {
        this.reductionType = reductionType;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public void setFrom(LocalDateTime from) {
        this.from = from;
    }

    public LocalDateTime getTo() {
        return to;
    }

    public void setTo(LocalDateTime to) {
        this.to = to;
    }
}