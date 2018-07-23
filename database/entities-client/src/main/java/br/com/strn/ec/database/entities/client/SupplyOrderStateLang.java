package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "supplyorderstatelang")
public class SupplyOrderStateLang implements Serializable {

	private String id;
	private SupplyOrderState supplyOrderState;
	private Lang lang;
	private String name;

    @Id
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_supply_order_state")
	public SupplyOrderState getSupplyOrderState() {
		return supplyOrderState;
	}

	public void setSupplyOrderState(SupplyOrderState supplyOrderState) {
		this.supplyOrderState = supplyOrderState;
	}

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_lang")
	public Lang getLang() {
		return lang;
	}

	public void setLang(Lang lang) {
		this.lang = lang;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}