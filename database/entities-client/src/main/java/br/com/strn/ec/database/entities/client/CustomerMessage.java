package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "customermessage")
public class CustomerMessage implements Serializable {

    private String id;
    private CustomerThread customerThread;
    private Employee employee;
    private String message;
    private String fileName;
    private String ipAddress;
    private String userAgent;
    private LocalDateTime dateAdd;
    private LocalDateTime dateUpd;
    private Boolean privated;
    private Boolean read;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_customer_thread")
    public CustomerThread getCustomerThread() {
        return customerThread;
    }

    public void setCustomerThread(CustomerThread customerThread) {
        this.customerThread = customerThread;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_employee")
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public LocalDateTime getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(LocalDateTime dateAdd) {
        this.dateAdd = dateAdd;
    }

    public LocalDateTime getDateUpd() {
        return dateUpd;
    }

    public void setDateUpd(LocalDateTime dateUpd) {
        this.dateUpd = dateUpd;
    }

    public Boolean getPrivated() {
        return privated;
    }

    public void setPrivated(Boolean privated) {
        this.privated = privated;
    }

    public Boolean getRead() {
        return read;
    }

    public void setRead(Boolean read) {
        this.read = read;
    }
}