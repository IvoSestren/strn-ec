package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "modulepreference")
public class ModulePreference implements Serializable {

    private String id;
    private Employee employee;
    private String module;
    private Boolean interest;
    private Boolean favorite;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_employee")
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public Boolean getInterest() {
        return interest;
    }

    public void setInterest(Boolean interest) {
        this.interest = interest;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }
}