package br.com.strn.ec.database.entities.master;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "sysdbdatabase")
public class SysDbDatabase implements Serializable {

    private String id;
    private String database;
    private SysDbHost host;
    private Boolean active;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public SysDbHost getHost() {
        return host;
    }

    public void setHost(SysDbHost host) {
        this.host = host;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
