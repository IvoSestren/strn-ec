package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "customer")
public class Customer implements Serializable {

    private String id;
    private ShopGroup shopGroup;
    private Shop shop;
    private Gender gender;
    private Group defaultGroup;
    private Lang lang;
    private Risk risk;
    private String company;
    private String siret;
    private String ape;
    private String firstname;
    private String lastname;
    private String email;
    private String passwd;
    private LocalDateTime lastPasswdGen;
    private LocalDateTime birthday;
    private Boolean newsletter;
    private String ipRegistrationNewsletter;
    private LocalDateTime newsletterDateAdd;
    private Boolean optin;
    private String website;
    private BigDecimal outstandingAllowAmount;
    private Boolean showPublicPrices;
    private Integer maxPaymentDays;
    private String secureKey;
    private String note;
    private Boolean active;
    private Boolean isGuest;
    private Boolean deleted;
    private LocalDateTime dateAdd;
    private LocalDateTime dateUpd;
    private String resetPasswordToken;
    private LocalDateTime resetPasswordValidity;

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
    @JoinColumn(name = "id_gender")
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_default_group")
    public Group getDefaultGroup() {
        return defaultGroup;
    }

    public void setDefaultGroup(Group defaultGroup) {
        this.defaultGroup = defaultGroup;
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
    @JoinColumn(name = "id_risk")
    public Risk getRisk() {
        return risk;
    }

    public void setRisk(Risk risk) {
        this.risk = risk;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSiret() {
        return siret;
    }

    public void setSiret(String siret) {
        this.siret = siret;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public LocalDateTime getLastPasswdGen() {
        return lastPasswdGen;
    }

    public void setLastPasswdGen(LocalDateTime lastPasswdGen) {
        this.lastPasswdGen = lastPasswdGen;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public Boolean getNewsletter() {
        return newsletter;
    }

    public void setNewsletter(Boolean newsletter) {
        this.newsletter = newsletter;
    }

    public String getIpRegistrationNewsletter() {
        return ipRegistrationNewsletter;
    }

    public void setIpRegistrationNewsletter(String ipRegistrationNewsletter) {
        this.ipRegistrationNewsletter = ipRegistrationNewsletter;
    }

    public LocalDateTime getNewsletterDateAdd() {
        return newsletterDateAdd;
    }

    public void setNewsletterDateAdd(LocalDateTime newsletterDateAdd) {
        this.newsletterDateAdd = newsletterDateAdd;
    }

    public Boolean getOptin() {
        return optin;
    }

    public void setOptin(Boolean optin) {
        this.optin = optin;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public BigDecimal getOutstandingAllowAmount() {
        return outstandingAllowAmount;
    }

    public void setOutstandingAllowAmount(BigDecimal outstandingAllowAmount) {
        this.outstandingAllowAmount = outstandingAllowAmount;
    }

    public Boolean getShowPublicPrices() {
        return showPublicPrices;
    }

    public void setShowPublicPrices(Boolean showPublicPrices) {
        this.showPublicPrices = showPublicPrices;
    }

    public Integer getMaxPaymentDays() {
        return maxPaymentDays;
    }

    public void setMaxPaymentDays(Integer maxPaymentDays) {
        this.maxPaymentDays = maxPaymentDays;
    }

    public String getSecureKey() {
        return secureKey;
    }

    public void setSecureKey(String secureKey) {
        this.secureKey = secureKey;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getGuest() {
        return isGuest;
    }

    public void setGuest(Boolean guest) {
        isGuest = guest;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
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

    public String getResetPasswordToken() {
        return resetPasswordToken;
    }

    public void setResetPasswordToken(String resetPasswordToken) {
        this.resetPasswordToken = resetPasswordToken;
    }

    public LocalDateTime getResetPasswordValidity() {
        return resetPasswordValidity;
    }

    public void setResetPasswordValidity(LocalDateTime resetPasswordValidity) {
        this.resetPasswordValidity = resetPasswordValidity;
    }
}