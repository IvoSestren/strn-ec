package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "zoneshop")
public class ZoneShop implements Serializable {

	private String id;
	private Zone zone;
    private Shop shop;

    @Id
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_zone")
	public Zone getZone() {
		return zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
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