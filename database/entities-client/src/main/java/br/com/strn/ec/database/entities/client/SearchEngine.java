package br.com.strn.ec.database.entities.client;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "searchengine")
public class SearchEngine implements Serializable {

    private String id;
    private String server;
    private String getvar;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getGetvar() {
        return getvar;
    }

    public void setGetvar(String getvar) {
        this.getvar = getvar;
    }
}