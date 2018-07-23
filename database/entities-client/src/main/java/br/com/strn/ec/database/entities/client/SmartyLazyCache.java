package br.com.strn.ec.database.entities.client;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "smartylazycache")
public class SmartyLazyCache implements Serializable {

    private String id;
    private String templateHash;
    private String cacheId;
    private String compileId;
    private String filepath;
    private LocalDateTime lastUpdate;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTemplateHash() {
        return templateHash;
    }

    public void setTemplateHash(String templateHash) {
        this.templateHash = templateHash;
    }

    public String getCacheId() {
        return cacheId;
    }

    public void setCacheId(String cacheId) {
        this.cacheId = cacheId;
    }

    public String getCompileId() {
        return compileId;
    }

    public void setCompileId(String compileId) {
        this.compileId = compileId;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}