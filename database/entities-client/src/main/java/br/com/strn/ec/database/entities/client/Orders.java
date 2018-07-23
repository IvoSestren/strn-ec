package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
public class Orders implements Serializable {
    private String id;
    private String reference;
    private ShopGroup shopGroup;
    private Shop shop;
    private Carrier carrier;
    private Lang lang;
    private Customer customer;
    private Cart cart;
    private Currencies currency;
    private Address addressDelivery;
    private Address addressInvoice;
    private Integer currentState;
    private String secureKey;
    private String payment;
    private BigDecimal conversionRate;
    private String module;
    private Boolean recyclable;
    private Boolean gift;
    private String giftMessage;
    private Boolean mobileTheme;
    private String shippingNumber;
    private BigDecimal totalDiscounts;
    private BigDecimal totalDiscountsTaxIncl;
    private BigDecimal totalDiscountsTaxExcl;
    private BigDecimal totalPaid;
    private BigDecimal totalPaidTaxIncl;
    private BigDecimal totalPaidTaxExcl;
    private BigDecimal totalPaidReal;
    private BigDecimal totalProducts;
    private BigDecimal totalProductsWt;
    private BigDecimal totalShipping;
    private BigDecimal totalShippingTaxIncl;
    private BigDecimal totalShippingTaxExcl;
    private BigDecimal carrierTaxRate;
    private BigDecimal totalWrapping;
    private BigDecimal totalWrappingTaxIncl;
    private BigDecimal totalWrappingTaxExcl;
    private Boolean roundMode;
    private Boolean roundType;
    private Integer invoiceNumber;
    private Integer deliveryNumber;
    private LocalDateTime invoiceDate;
    private LocalDateTime deliveryDate;
    private Boolean valid;
    private LocalDateTime dateAdd;
    private LocalDateTime dateUpd;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
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
    @JoinColumn(name = "id_shop")
    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
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
    @JoinColumn(name = "id_lang")
    public Lang getLang() {
        return lang;
    }

    public void setLang(Lang lang) {
        this.lang = lang;
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
    @JoinColumn(name = "id_cart")
    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
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
    @JoinColumn(name = "id_address_delivery")
    public Address getAddressDelivery() {
        return addressDelivery;
    }

    public void setAddressDelivery(Address addressDelivery) {
        this.addressDelivery = addressDelivery;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_address_invoice")
    public Address getAddressInvoice() {
        return addressInvoice;
    }

    public void setAddressInvoice(Address addressInvoice) {
        this.addressInvoice = addressInvoice;
    }

    public Integer getCurrentState() {
        return currentState;
    }

    public void setCurrentState(Integer currentState) {
        this.currentState = currentState;
    }

    public String getSecureKey() {
        return secureKey;
    }

    public void setSecureKey(String secureKey) {
        this.secureKey = secureKey;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public BigDecimal getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(BigDecimal conversionRate) {
        this.conversionRate = conversionRate;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public Boolean getRecyclable() {
        return recyclable;
    }

    public void setRecyclable(Boolean recyclable) {
        this.recyclable = recyclable;
    }

    public Boolean getGift() {
        return gift;
    }

    public void setGift(Boolean gift) {
        this.gift = gift;
    }

    public String getGiftMessage() {
        return giftMessage;
    }

    public void setGiftMessage(String giftMessage) {
        this.giftMessage = giftMessage;
    }

    public Boolean getMobileTheme() {
        return mobileTheme;
    }

    public void setMobileTheme(Boolean mobileTheme) {
        this.mobileTheme = mobileTheme;
    }

    public String getShippingNumber() {
        return shippingNumber;
    }

    public void setShippingNumber(String shippingNumber) {
        this.shippingNumber = shippingNumber;
    }

    public BigDecimal getTotalDiscounts() {
        return totalDiscounts;
    }

    public void setTotalDiscounts(BigDecimal totalDiscounts) {
        this.totalDiscounts = totalDiscounts;
    }

    public BigDecimal getTotalDiscountsTaxIncl() {
        return totalDiscountsTaxIncl;
    }

    public void setTotalDiscountsTaxIncl(BigDecimal totalDiscountsTaxIncl) {
        this.totalDiscountsTaxIncl = totalDiscountsTaxIncl;
    }

    public BigDecimal getTotalDiscountsTaxExcl() {
        return totalDiscountsTaxExcl;
    }

    public void setTotalDiscountsTaxExcl(BigDecimal totalDiscountsTaxExcl) {
        this.totalDiscountsTaxExcl = totalDiscountsTaxExcl;
    }

    public BigDecimal getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(BigDecimal totalPaid) {
        this.totalPaid = totalPaid;
    }

    public BigDecimal getTotalPaidTaxIncl() {
        return totalPaidTaxIncl;
    }

    public void setTotalPaidTaxIncl(BigDecimal totalPaidTaxIncl) {
        this.totalPaidTaxIncl = totalPaidTaxIncl;
    }

    public BigDecimal getTotalPaidTaxExcl() {
        return totalPaidTaxExcl;
    }

    public void setTotalPaidTaxExcl(BigDecimal totalPaidTaxExcl) {
        this.totalPaidTaxExcl = totalPaidTaxExcl;
    }

    public BigDecimal getTotalPaidReal() {
        return totalPaidReal;
    }

    public void setTotalPaidReal(BigDecimal totalPaidReal) {
        this.totalPaidReal = totalPaidReal;
    }

    public BigDecimal getTotalProducts() {
        return totalProducts;
    }

    public void setTotalProducts(BigDecimal totalProducts) {
        this.totalProducts = totalProducts;
    }

    public BigDecimal getTotalProductsWt() {
        return totalProductsWt;
    }

    public void setTotalProductsWt(BigDecimal totalProductsWt) {
        this.totalProductsWt = totalProductsWt;
    }

    public BigDecimal getTotalShipping() {
        return totalShipping;
    }

    public void setTotalShipping(BigDecimal totalShipping) {
        this.totalShipping = totalShipping;
    }

    public BigDecimal getTotalShippingTaxIncl() {
        return totalShippingTaxIncl;
    }

    public void setTotalShippingTaxIncl(BigDecimal totalShippingTaxIncl) {
        this.totalShippingTaxIncl = totalShippingTaxIncl;
    }

    public BigDecimal getTotalShippingTaxExcl() {
        return totalShippingTaxExcl;
    }

    public void setTotalShippingTaxExcl(BigDecimal totalShippingTaxExcl) {
        this.totalShippingTaxExcl = totalShippingTaxExcl;
    }

    public BigDecimal getCarrierTaxRate() {
        return carrierTaxRate;
    }

    public void setCarrierTaxRate(BigDecimal carrierTaxRate) {
        this.carrierTaxRate = carrierTaxRate;
    }

    public BigDecimal getTotalWrapping() {
        return totalWrapping;
    }

    public void setTotalWrapping(BigDecimal totalWrapping) {
        this.totalWrapping = totalWrapping;
    }

    public BigDecimal getTotalWrappingTaxIncl() {
        return totalWrappingTaxIncl;
    }

    public void setTotalWrappingTaxIncl(BigDecimal totalWrappingTaxIncl) {
        this.totalWrappingTaxIncl = totalWrappingTaxIncl;
    }

    public BigDecimal getTotalWrappingTaxExcl() {
        return totalWrappingTaxExcl;
    }

    public void setTotalWrappingTaxExcl(BigDecimal totalWrappingTaxExcl) {
        this.totalWrappingTaxExcl = totalWrappingTaxExcl;
    }

    public Boolean getRoundMode() {
        return roundMode;
    }

    public void setRoundMode(Boolean roundMode) {
        this.roundMode = roundMode;
    }

    public Boolean getRoundType() {
        return roundType;
    }

    public void setRoundType(Boolean roundType) {
        this.roundType = roundType;
    }

    public Integer getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(Integer invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Integer getDeliveryNumber() {
        return deliveryNumber;
    }

    public void setDeliveryNumber(Integer deliveryNumber) {
        this.deliveryNumber = deliveryNumber;
    }

    public LocalDateTime getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(LocalDateTime invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDateTime deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
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
}