package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "linksmenutop")
public class Linksmenutop implements Serializable {
	private String id;
    private Shop shop;
    private Boolean newWindow;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_shop")
    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Boolean getNewWindow() {
        return newWindow;
    }

    public void setNewWindow(Boolean newWindow) {
        this.newWindow = newWindow;
    }
}