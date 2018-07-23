package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {

	private String id;
    private Profile profile;
    private Lang lang;
    private String lastname;
    private String firstname;
    private String email;
    private String passwd;
    private LocalDateTime lastPasswdGen;
    private LocalDateTime statsDateFrom;
    private LocalDateTime statsDateTo;
    private LocalDateTime statsCompareFrom;
    private LocalDateTime statsCompareTo;
    private Boolean statsCompareOption;
    private String preselectDateRange;
    private String boColor;
    private String boTheme;
    private String boCss;
    private Integer defaultTab;
    private Integer boWidth;
    private Boolean boMenu;
    private Boolean active;
    private Boolean optin;
    private Orders lastOrder;
    private CustomerMessage lastCustomerMessage;
    private Customer lastCustomer;
    private LocalDateTime lastConnectionDate;
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
    @JoinColumn(name = "id_profile")
    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_lang")
    public Lang getLang() {
        return lang;
    }

    public void setLang(Lang lang) {
        this.lang = lang;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
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

    @Column(name = "last_passwd_gen")
    public LocalDateTime getLastPasswdGen() {
        return lastPasswdGen;
    }

    public void setLastPasswdGen(LocalDateTime lastPasswdGen) {
        this.lastPasswdGen = lastPasswdGen;
    }

    @Column(name = "stats_date_from")
    public LocalDateTime getStatsDateFrom() {
        return statsDateFrom;
    }

    public void setStatsDateFrom(LocalDateTime statsDateFrom) {
        this.statsDateFrom = statsDateFrom;
    }

    @Column(name = "stats_date_to")
    public LocalDateTime getStatsDateTo() {
        return statsDateTo;
    }

    public void setStatsDateTo(LocalDateTime statsDateTo) {
        this.statsDateTo = statsDateTo;
    }

    @Column(name = "stats_compare_from")
    public LocalDateTime getStatsCompareFrom() {
        return statsCompareFrom;
    }

    public void setStatsCompareFrom(LocalDateTime statsCompareFrom) {
        this.statsCompareFrom = statsCompareFrom;
    }

    @Column(name = "stats_compare_to")
    public LocalDateTime getStatsCompareTo() {
        return statsCompareTo;
    }

    public void setStatsCompareTo(LocalDateTime statsCompareTo) {
        this.statsCompareTo = statsCompareTo;
    }

    @Column(name = "stats_compare_option")
    public Boolean getStatsCompareOption() {
        return statsCompareOption;
    }

    public void setStatsCompareOption(Boolean statsCompareOption) {
        this.statsCompareOption = statsCompareOption;
    }

    @Column(name = "preselect_date_range")
    public String getPreselectDateRange() {
        return preselectDateRange;
    }

    public void setPreselectDateRange(String preselectDateRange) {
        this.preselectDateRange = preselectDateRange;
    }

    @Column(name = "bo_color")
    public String getBoColor() {
        return boColor;
    }

    public void setBoColor(String boColor) {
        this.boColor = boColor;
    }

    @Column(name = "bo_theme")
    public String getBoTheme() {
        return boTheme;
    }

    public void setBoTheme(String boTheme) {
        this.boTheme = boTheme;
    }

    @Column(name = "bo_css")
    public String getBoCss() {
        return boCss;
    }

    public void setBoCss(String boCss) {
        this.boCss = boCss;
    }

    @Column(name = "default_tab")
    public Integer getDefaultTab() {
        return defaultTab;
    }

    public void setDefaultTab(Integer defaultTab) {
        this.defaultTab = defaultTab;
    }

    @Column(name = "bo_width")
    public Integer getBoWidth() {
        return boWidth;
    }

    public void setBoWidth(Integer boWidth) {
        this.boWidth = boWidth;
    }

    @Column(name = "bo_menu")
    public Boolean getBoMenu() {
        return boMenu;
    }

    public void setBoMenu(Boolean boMenu) {
        this.boMenu = boMenu;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getOptin() {
        return optin;
    }

    public void setOptin(Boolean optin) {
        this.optin = optin;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_last_order")
    public Orders getLastOrder() {
        return lastOrder;
    }

    public void setLastOrder(Orders lastOrder) {
        this.lastOrder = lastOrder;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_last_customer_message")
    public CustomerMessage getLastCustomerMessage() {
        return lastCustomerMessage;
    }

    public void setLastCustomerMessage(CustomerMessage lastCustomerMessage) {
        this.lastCustomerMessage = lastCustomerMessage;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_last_customer")
    public Customer getLastCustomer() {
        return lastCustomer;
    }

    public void setLastCustomer(Customer lastCustomer) {
        this.lastCustomer = lastCustomer;
    }

    @Column(name = "last_connection_date")
    public LocalDateTime getLastConnectionDate() {
        return lastConnectionDate;
    }

    public void setLastConnectionDate(LocalDateTime lastConnectionDate) {
        this.lastConnectionDate = lastConnectionDate;
    }

    @Column(name = "reset_password_token")
    public String getResetPasswordToken() {
        return resetPasswordToken;
    }

    public void setResetPasswordToken(String resetPasswordToken) {
        this.resetPasswordToken = resetPasswordToken;
    }

    @Column(name = "reset_password_validity")
    public LocalDateTime getResetPasswordValidity() {
        return resetPasswordValidity;
    }

    public void setResetPasswordValidity(LocalDateTime resetPasswordValidity) {
        this.resetPasswordValidity = resetPasswordValidity;
    }
}