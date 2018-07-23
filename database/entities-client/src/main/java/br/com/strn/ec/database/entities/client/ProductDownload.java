package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "productdownload")
public class ProductDownload implements Serializable {

    private String id;
    private Product product;
    private String displayFilename;
    private String filename;
    private LocalDateTime dateAdd;
    private LocalDateTime dateExpiration;
    private Integer nbDaysAccessible;
    private Integer nbDownloadable;
    private Boolean active;
    private Boolean isShareable;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_product")
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getDisplayFilename() {
        return displayFilename;
    }

    public void setDisplayFilename(String displayFilename) {
        this.displayFilename = displayFilename;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public LocalDateTime getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(LocalDateTime dateAdd) {
        this.dateAdd = dateAdd;
    }

    public LocalDateTime getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(LocalDateTime dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public Integer getNbDaysAccessible() {
        return nbDaysAccessible;
    }

    public void setNbDaysAccessible(Integer nbDaysAccessible) {
        this.nbDaysAccessible = nbDaysAccessible;
    }

    public Integer getNbDownloadable() {
        return nbDownloadable;
    }

    public void setNbDownloadable(Integer nbDownloadable) {
        this.nbDownloadable = nbDownloadable;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getShareable() {
        return isShareable;
    }

    public void setShareable(Boolean shareable) {
        isShareable = shareable;
    }
}