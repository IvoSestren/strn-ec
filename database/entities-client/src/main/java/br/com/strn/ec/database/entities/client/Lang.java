package br.com.strn.ec.database.entities.client;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "lang")
public class Lang implements Serializable {

    private String id;
    private String name;
    private Boolean active;
    private String isoCode;
    private String languageCode;
    private String locale;
    private String dateFormatLite;
    private String dateFormatFull;
    private Boolean isRtl;

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

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getDateFormatLite() {
        return dateFormatLite;
    }

    public void setDateFormatLite(String dateFormatLite) {
        this.dateFormatLite = dateFormatLite;
    }

    public String getDateFormatFull() {
        return dateFormatFull;
    }

    public void setDateFormatFull(String dateFormatFull) {
        this.dateFormatFull = dateFormatFull;
    }

    public Boolean getRtl() {
        return isRtl;
    }

    public void setRtl(Boolean rtl) {
        isRtl = rtl;
    }
}