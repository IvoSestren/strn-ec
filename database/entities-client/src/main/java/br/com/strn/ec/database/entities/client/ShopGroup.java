package br.com.strn.ec.database.entities.client;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "shopgroup")
public class ShopGroup implements Serializable {

	private String id;
    private String name;
    private Boolean shareCustomer;
    private Boolean shareOrder;
    private Boolean shareStock;
    private Boolean active;
    private Boolean deleted;

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

    public Boolean getShareCustomer() {
        return shareCustomer;
    }

    public void setShareCustomer(Boolean shareCustomer) {
        this.shareCustomer = shareCustomer;
    }

    public Boolean getShareOrder() {
        return shareOrder;
    }

    public void setShareOrder(Boolean shareOrder) {
        this.shareOrder = shareOrder;
    }

    public Boolean getShareStock() {
        return shareStock;
    }

    public void setShareStock(Boolean shareStock) {
        this.shareStock = shareStock;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}