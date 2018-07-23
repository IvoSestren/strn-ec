package br.com.strn.ec.database.entities.client;

import br.com.strn.ec.database.entities.client.enums.SpecificPriceReductionType;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "specificprice")
public class SpecificPrice implements Serializable {

    private String id;
    private SpecificPriceRule specificPriceRule;
    private Cart cart;
    private Product product;
    private Shop shop;
    private ShopGroup shopGroup;
    private Currencies currency;
    private Country country;
    private Group group;
    private Customer customer;
    private ProductAttribute productAttribute;
    private BigDecimal price;
    private Integer fromQuantity;
    private BigDecimal reduction;
    private Boolean reductionTax;
    private SpecificPriceReductionType reductionType;
    private LocalDateTime from;
    private LocalDateTime to;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_specific_price_rule")
    public SpecificPriceRule getSpecificPriceRule() {
        return specificPriceRule;
    }

    public void setSpecificPriceRule(SpecificPriceRule specificPriceRule) {
        this.specificPriceRule = specificPriceRule;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cart")
    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_product")
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_customer")
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_product_attribute")
    public ProductAttribute getProductAttribute() {
        return productAttribute;
    }

    public void setProductAttribute(ProductAttribute productAttribute) {
        this.productAttribute = productAttribute;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getFromQuantity() {
        return fromQuantity;
    }

    public void setFromQuantity(Integer fromQuantity) {
        this.fromQuantity = fromQuantity;
    }

    public BigDecimal getReduction() {
        return reduction;
    }

    public void setReduction(BigDecimal reduction) {
        this.reduction = reduction;
    }

    public Boolean getReductionTax() {
        return reductionTax;
    }

    public void setReductionTax(Boolean reductionTax) {
        this.reductionTax = reductionTax;
    }

    @Enumerated(EnumType.STRING)
    public SpecificPriceReductionType getReductionType() {
        return reductionType;
    }

    public void setReductionType(SpecificPriceReductionType reductionType) {
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