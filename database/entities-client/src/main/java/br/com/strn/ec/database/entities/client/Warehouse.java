package br.com.strn.ec.database.entities.client;

import br.com.strn.ec.database.entities.client.enums.WarehouseManagementType;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "warehouse")
public class Warehouse implements Serializable {

    private String id;
    private Currencies currency;
    private Address address;
    private Employee employee;
    private String reference;
    private String name;
    private WarehouseManagementType managementType;
    private Boolean deleted;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_currency")
    public Currencies getCurrency() {
        return currency;
    }

    public void setCurrency(Currencies currency) {
        this.currency = currency;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_address")
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_employee")
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Enumerated(EnumType.STRING)
    public WarehouseManagementType getManagementType() {
        return managementType;
    }

    public void setManagementType(WarehouseManagementType managementType) {
        this.managementType = managementType;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}