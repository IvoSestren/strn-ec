package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "guest")
public class Guest implements Serializable {

    private String id;
    private OperatingSystem operatingSystem;
    private WebBrowser webBrowser;
    private Customer customer;
    private Boolean javascript;
    private Integer screenResolutionX;
    private Integer screenResolutionY;
    private Integer screenColor;
    private Boolean sunJava;
    private Boolean adobeFlash;
    private Boolean adobeDirector;
    private Boolean adobeQuicktime;
    private Boolean realPlayer;
    private Boolean windowsMedia;
    private String acceptLanguage;
    private Boolean mobileTheme;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_operating_system")
    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_web_browser")
    public WebBrowser getWebBrowser() {
        return webBrowser;
    }

    public void setWebBrowser(WebBrowser webBrowser) {
        this.webBrowser = webBrowser;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_customer")
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Boolean getJavascript() {
        return javascript;
    }

    public void setJavascript(Boolean javascript) {
        this.javascript = javascript;
    }

    public Integer getScreenResolutionX() {
        return screenResolutionX;
    }

    public void setScreenResolutionX(Integer screenResolutionX) {
        this.screenResolutionX = screenResolutionX;
    }

    public Integer getScreenResolutionY() {
        return screenResolutionY;
    }

    public void setScreenResolutionY(Integer screenResolutionY) {
        this.screenResolutionY = screenResolutionY;
    }

    public Integer getScreenColor() {
        return screenColor;
    }

    public void setScreenColor(Integer screenColor) {
        this.screenColor = screenColor;
    }

    public Boolean getSunJava() {
        return sunJava;
    }

    public void setSunJava(Boolean sunJava) {
        this.sunJava = sunJava;
    }

    public Boolean getAdobeFlash() {
        return adobeFlash;
    }

    public void setAdobeFlash(Boolean adobeFlash) {
        this.adobeFlash = adobeFlash;
    }

    public Boolean getAdobeDirector() {
        return adobeDirector;
    }

    public void setAdobeDirector(Boolean adobeDirector) {
        this.adobeDirector = adobeDirector;
    }

    public Boolean getAdobeQuicktime() {
        return adobeQuicktime;
    }

    public void setAdobeQuicktime(Boolean adobeQuicktime) {
        this.adobeQuicktime = adobeQuicktime;
    }

    public Boolean getRealPlayer() {
        return realPlayer;
    }

    public void setRealPlayer(Boolean realPlayer) {
        this.realPlayer = realPlayer;
    }

    public Boolean getWindowsMedia() {
        return windowsMedia;
    }

    public void setWindowsMedia(Boolean windowsMedia) {
        this.windowsMedia = windowsMedia;
    }

    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    public Boolean getMobileTheme() {
        return mobileTheme;
    }

    public void setMobileTheme(Boolean mobileTheme) {
        this.mobileTheme = mobileTheme;
    }
}