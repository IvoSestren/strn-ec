package br.com.strn.ec.database.entities.client;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "group")
public class Group implements Serializable {

    private String id;
    private BigDecimal reduction;
    private Integer priceDisplayMethod;
    private Boolean showPrices;
    private LocalDateTime dateAdd;
    private LocalDateTime dateUpd;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getReduction() {
        return reduction;
    }

    public void setReduction(BigDecimal reduction) {
        this.reduction = reduction;
    }

    public Integer getPriceDisplayMethod() {
        return priceDisplayMethod;
    }

    public void setPriceDisplayMethod(Integer priceDisplayMethod) {
        this.priceDisplayMethod = priceDisplayMethod;
    }

    public Boolean getShowPrices() {
        return showPrices;
    }

    public void setShowPrices(Boolean showPrices) {
        this.showPrices = showPrices;
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