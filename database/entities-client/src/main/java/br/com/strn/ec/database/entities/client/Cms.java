package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cms")
public class Cms implements Serializable {

    private String id;
    private CmsCategory cmsCategory;
    private Integer position;
    private Boolean active;
    private Boolean indexation;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cms_category")
    public CmsCategory getCmsCategory() {
        return cmsCategory;
    }

    public void setCmsCategory(CmsCategory cmsCategory) {
        this.cmsCategory = cmsCategory;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getIndexation() {
        return indexation;
    }

    public void setIndexation(Boolean indexation) {
        this.indexation = indexation;
    }
}