package br.com.strn.ec.database.entities.client;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "customermessagesyncimap")
public class CustomerMessageSyncImap implements Serializable {

    private String id;
    private String md5Header;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMd5Header() {
        return md5Header;
    }

    public void setMd5Header(String md5Header) {
        this.md5Header = md5Header;
    }
}