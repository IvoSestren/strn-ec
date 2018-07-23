package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "country")
public class Country implements Serializable {

	private String id;
	private Zone zone;
    private Currencies currency;
    private String isoCode;
    private Integer callPrefix;
    private Boolean active;
    private Boolean containStates;
    private Boolean needIdentificationNumber;
    private Boolean needZipCode;
    private String zipCodeFormat;
    private Boolean displayTaxLabel;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_zone")
    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_currency")
    public Currencies getCurrency() {
        return currency;
    }

    public void setCurrency(Currencies currency) {
        this.currency = currency;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public Integer getCallPrefix() {
        return callPrefix;
    }

    public void setCallPrefix(Integer callPrefix) {
        this.callPrefix = callPrefix;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getContainStates() {
        return containStates;
    }

    public void setContainStates(Boolean containStates) {
        this.containStates = containStates;
    }

    public Boolean getNeedIdentificationNumber() {
        return needIdentificationNumber;
    }

    public void setNeedIdentificationNumber(Boolean needIdentificationNumber) {
        this.needIdentificationNumber = needIdentificationNumber;
    }

    public Boolean getNeedZipCode() {
        return needZipCode;
    }

    public void setNeedZipCode(Boolean needZipCode) {
        this.needZipCode = needZipCode;
    }

    public String getZipCodeFormat() {
        return zipCodeFormat;
    }

    public void setZipCodeFormat(String zipCodeFormat) {
        this.zipCodeFormat = zipCodeFormat;
    }

    public Boolean getDisplayTaxLabel() {
        return displayTaxLabel;
    }

    public void setDisplayTaxLabel(Boolean displayTaxLabel) {
        this.displayTaxLabel = displayTaxLabel;
    }
}