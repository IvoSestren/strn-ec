package br.com.strn.ec.database.entities.client;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "meta")
public class Meta implements Serializable {

    private String id;
    private String page;
    private Boolean configurable;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public Boolean getConfigurable() {
        return configurable;
    }

    public void setConfigurable(Boolean configurable) {
        this.configurable = configurable;
    }
}