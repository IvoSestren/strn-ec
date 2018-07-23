package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "supplyorderhistory")
public class SupplyOrderHistory implements Serializable {

    private String id;
    private SupplyOrderHistory supplyOrderHistory;
    private SupplyOrder supplyOrder;
    private Employee employee;
    private String employeeLastname;
    private String employeeFirstname;
    private State state;
    private LocalDateTime dateAdd;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_supply_order_history")
    public SupplyOrderHistory getSupplyOrderHistory() {
        return supplyOrderHistory;
    }

    public void setSupplyOrderHistory(SupplyOrderHistory supplyOrderHistory) {
        this.supplyOrderHistory = supplyOrderHistory;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_supply_order")
    public SupplyOrder getSupplyOrder() {
        return supplyOrder;
    }

    public void setSupplyOrder(SupplyOrder supplyOrder) {
        this.supplyOrder = supplyOrder;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_employee")
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getEmployeeLastname() {
        return employeeLastname;
    }

    public void setEmployeeLastname(String employeeLastname) {
        this.employeeLastname = employeeLastname;
    }

    public String getEmployeeFirstname() {
        return employeeFirstname;
    }

    public void setEmployeeFirstname(String employeeFirstname) {
        this.employeeFirstname = employeeFirstname;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_state")
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public LocalDateTime getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(LocalDateTime dateAdd) {
        this.dateAdd = dateAdd;
    }
}