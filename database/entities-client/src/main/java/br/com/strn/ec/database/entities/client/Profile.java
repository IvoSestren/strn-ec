package br.com.strn.ec.database.entities.client;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "profile")
public class Profile implements Serializable {

	private String id;

	@Id
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}