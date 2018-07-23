package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "webserviceaccountshop")
public class WebserviceAccountShop implements Serializable {

    private String id;
    private WebserviceAccount webserviceAccount;
    private Shop shop;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_webservice_account")
    public WebserviceAccount getWebserviceAccount() {
        return webserviceAccount;
    }

    public void setWebserviceAccount(WebserviceAccount webserviceAccount) {
        this.webserviceAccount = webserviceAccount;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_shop")
    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}