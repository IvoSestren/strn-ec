package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tab")
public class Tab implements Serializable {

    private String id;
    private Tab parent;
    private Integer position;
    private String module;
    private String className;
    private Boolean active;
    private Boolean hideHostMode;
    private String icon;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_ps_tab")
    public Tab getParent() {
        return parent;
    }

    public void setParent(Tab parent) {
        this.parent = parent;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getHideHostMode() {
        return hideHostMode;
    }

    public void setHideHostMode(Boolean hideHostMode) {
        this.hideHostMode = hideHostMode;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}