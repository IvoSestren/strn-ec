package br.com.strn.ec.database.entities.master;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "sysurl")
public class SysUrl implements Serializable {

    private String id;
    private SysContract contract;
    private String url;
    private SysDbSchema schema;
    private Boolean active;
    private String idShop;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_syscontract")
    public SysContract getContract() {
        return contract;
    }

    public void setContract(SysContract contract) {
        this.contract = contract;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_sysdbschema")
    public SysDbSchema getSchema() {
        return schema;
    }

    public void setSchema(SysDbSchema schema) {
        this.schema = schema;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Column(name = "id_shop")
    public String getIdShop() {
        return idShop;
    }

    public void setIdShop(String idShop) {
        this.idShop = idShop;
    }
}
