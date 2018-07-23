package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "cmscategory")
public class CmsCategory implements Serializable {

    private String id;
    private CmsCategory parent;
    private Integer levelDepth;
    private Boolean active;
    private LocalDateTime dateAdd;
    private LocalDateTime dateUpd;
    private Integer position;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cms_category")
    public CmsCategory getParent() {
        return parent;
    }

    public void setParent(CmsCategory parent) {
        this.parent = parent;
    }

    public Integer getLevelDepth() {
        return levelDepth;
    }

    public void setLevelDepth(Integer levelDepth) {
        this.levelDepth = levelDepth;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
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

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
}