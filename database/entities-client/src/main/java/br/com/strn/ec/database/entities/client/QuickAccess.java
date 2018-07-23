package br.com.strn.ec.database.entities.client;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "quickaccess")
public class QuickAccess implements Serializable {

    private String id;
    private Boolean newWindow;
    private String link;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getNewWindow() {
        return newWindow;
    }

    public void setNewWindow(Boolean newWindow) {
        this.newWindow = newWindow;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}