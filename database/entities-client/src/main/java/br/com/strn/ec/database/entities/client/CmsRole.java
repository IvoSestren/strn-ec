package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cmsrole")
public class CmsRole implements Serializable {

    private String id;
    private String name;
    private Cms cms;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cms")
    public Cms getCms() {
        return cms;
    }

    public void setCms(Cms cms) {
        this.cms = cms;
    }
}