package br.com.strn.ec.database.entities.client;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "stockmvt")
public class StockMvt implements Serializable {

    private String id;
    private Stock stock;
    private Orders order;
    private SupplyOrder supplyOrder;
    private StockMvtReason stockMvtReason;
    private Employee employee;
    private String employeeLastname;
    private String employeeFirstname;
    private Integer physicalQuantity;
    private LocalDateTime dateAdd;
    private Integer sign;
    private BigDecimal priceTe;
    private BigDecimal lastWa;
    private BigDecimal currentWa;
    private Integer referer;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    public SupplyOrder getSupplyOrder() {
        return supplyOrder;
    }

    public void setSupplyOrder(SupplyOrder supplyOrder) {
        this.supplyOrder = supplyOrder;
    }

    public StockMvtReason getStockMvtReason() {
        return stockMvtReason;
    }

    public void setStockMvtReason(StockMvtReason stockMvtReason) {
        this.stockMvtReason = stockMvtReason;
    }

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

    public Integer getPhysicalQuantity() {
        return physicalQuantity;
    }

    public void setPhysicalQuantity(Integer physicalQuantity) {
        this.physicalQuantity = physicalQuantity;
    }

    public LocalDateTime getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(LocalDateTime dateAdd) {
        this.dateAdd = dateAdd;
    }

    public Integer getSign() {
        return sign;
    }

    public void setSign(Integer sign) {
        this.sign = sign;
    }

    public BigDecimal getPriceTe() {
        return priceTe;
    }

    public void setPriceTe(BigDecimal priceTe) {
        this.priceTe = priceTe;
    }

    public BigDecimal getLastWa() {
        return lastWa;
    }

    public void setLastWa(BigDecimal lastWa) {
        this.lastWa = lastWa;
    }

    public BigDecimal getCurrentWa() {
        return currentWa;
    }

    public void setCurrentWa(BigDecimal currentWa) {
        this.currentWa = currentWa;
    }

    public Integer getReferer() {
        return referer;
    }

    public void setReferer(Integer referer) {
        this.referer = referer;
    }
}