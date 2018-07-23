package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "cart")
public class Cart implements Serializable {

    private String id;
    private ShopGroup shopGroup;
    private Shop shop;
    private Carrier carrier;
    private String deliveryOption;
    private Lang lang;
    private Address addressDelivery;
    private Address addressInvoice;
    private Currencies currency;
    private Customer customer;
    private Guest guest;
    private String secureKey;
    private Boolean recycable;
    private Boolean gift;
    private String giftMessage;
    private Boolean mobileTheme;
    private Boolean allowSeperatedPackage;
    private LocalDateTime dateAdd;
    private LocalDateTime dateUpd;
    private String checkoutSessionDate;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getDeliveryOption() {
        return deliveryOption;
    }

    public void setDeliveryOption(String deliveryOption) {
        this.deliveryOption = deliveryOption;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_currency")
    public Currencies getCurrency() {
        return currency;
    }

    public void setCurrency(Currencies currency) {
        this.currency = currency;
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
    @JoinColumn(name = "id_guest")
    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public String getSecureKey() {
        return secureKey;
    }

    public void setSecureKey(String secureKey) {
        this.secureKey = secureKey;
    }

    public Boolean getRecycable() {
        return recycable;
    }

    public void setRecycable(Boolean recycable) {
        this.recycable = recycable;
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

    public Boolean getAllowSeperatedPackage() {
        return allowSeperatedPackage;
    }

    public void setAllowSeperatedPackage(Boolean allowSeperatedPackage) {
        this.allowSeperatedPackage = allowSeperatedPackage;
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

    public String getCheckoutSessionDate() {
        return checkoutSessionDate;
    }

    public void setCheckoutSessionDate(String checkoutSessionDate) {
        this.checkoutSessionDate = checkoutSessionDate;
    }
}