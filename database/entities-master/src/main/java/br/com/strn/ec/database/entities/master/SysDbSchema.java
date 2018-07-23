package br.com.strn.ec.database.entities.master;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "sysdbschema")
public class SysDbSchema implements Serializable {

    private String id;
    private String schema;
    private SysDbDatabase database;
    private Boolean active;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_sysdbdatabase")
    public SysDbDatabase getDatabase() {
        return database;
    }

    public void setDatabase(SysDbDatabase database) {
        this.database = database;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
