package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "supplyorderreceipthistory")
public class SupplyOrderReceiptHistory implements Serializable {

    private String id;
    private SupplyOrderDetail supplyOrderDetail;
    private Employee employee;
    private String employeeLastname;
    private String employeeFirstname;
    private SupplyOrderState supplyOrderState;
    private Integer quantity;
    private LocalDateTime dateAdd;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_supply_order_detail")
    public SupplyOrderDetail getSupplyOrderDetail() {
        return supplyOrderDetail;
    }

    public void setSupplyOrderDetail(SupplyOrderDetail supplyOrderDetail) {
        this.supplyOrderDetail = supplyOrderDetail;
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
    @JoinColumn(name = "id_supply_order_state")
    public SupplyOrderState getSupplyOrderState() {
        return supplyOrderState;
    }

    public void setSupplyOrderState(SupplyOrderState supplyOrderState) {
        this.supplyOrderState = supplyOrderState;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(LocalDateTime dateAdd) {
        this.dateAdd = dateAdd;
    }
}