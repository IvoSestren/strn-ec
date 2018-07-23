package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "configurationkpilang")
public class ConfigurationKpiLang implements Serializable {

    private String id;
    private ConfigurationKpi configurationKpi;
    private Lang lang;
    private String value;
    private LocalDateTime dateUpd;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_configuration_kpi")
    public ConfigurationKpi getConfigurationKpi() {
        return configurationKpi;
    }

    public void setConfigurationKpi(ConfigurationKpi configurationKpi) {
        this.configurationKpi = configurationKpi;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_lang")
    public Lang getLang() {
        return lang;
    }

    public void setLang(Lang lang) {
        this.lang = lang;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public LocalDateTime getDateUpd() {
        return dateUpd;
    }

    public void setDateUpd(LocalDateTime dateUpd) {
        this.dateUpd = dateUpd;
    }
}