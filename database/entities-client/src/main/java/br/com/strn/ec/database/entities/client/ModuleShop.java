package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "moduleshop")
public class ModuleShop implements Serializable {

	private String id;
    private Module module;
    private Shop shop;
    private Boolean enableDevice;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_module")
    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_shop")
    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Boolean getEnableDevice() {
        return enableDevice;
    }

    public void setEnableDevice(Boolean enableDevice) {
        this.enableDevice = enableDevice;
    }
}