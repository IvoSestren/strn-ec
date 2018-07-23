package br.com.strn.ec.database.entities.client;

import br.com.strn.ec.database.entities.client.enums.WebservicePermissionMethod;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "webservicepermission")
public class WebservicePermission implements Serializable {

    private String id;
    private String resource;
    private WebservicePermissionMethod method;
    private WebserviceAccount webserviceAccount;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    @Enumerated(EnumType.STRING)
    public WebservicePermissionMethod getMethod() {
        return method;
    }

    public void setMethod(WebservicePermissionMethod method) {
        this.method = method;
    }

    public WebserviceAccount getWebserviceAccount() {
        return webserviceAccount;
    }

    public void setWebserviceAccount(WebserviceAccount webserviceAccount) {
        this.webserviceAccount = webserviceAccount;
    }
}