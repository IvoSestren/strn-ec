package br.com.strn.ec.database.entities.client;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "orderstate")
public class OrderState implements Serializable {

    private String id;
    private Boolean invoice;
    private Boolean sendEmail;
    private String moduleName;
    private String color;
    private Boolean unremovable;
    private Boolean hidden;
    private Boolean logable;
    private Boolean delivery;
    private Boolean shipped;
    private Boolean paid;
    private Boolean pdfInvoice;
    private Boolean pdfDelivery;
    private Boolean deleted;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getInvoice() {
        return invoice;
    }

    public void setInvoice(Boolean invoice) {
        this.invoice = invoice;
    }

    public Boolean getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getUnremovable() {
        return unremovable;
    }

    public void setUnremovable(Boolean unremovable) {
        this.unremovable = unremovable;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public Boolean getLogable() {
        return logable;
    }

    public void setLogable(Boolean logable) {
        this.logable = logable;
    }

    public Boolean getDelivery() {
        return delivery;
    }

    public void setDelivery(Boolean delivery) {
        this.delivery = delivery;
    }

    public Boolean getShipped() {
        return shipped;
    }

    public void setShipped(Boolean shipped) {
        this.shipped = shipped;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    public Boolean getPdfInvoice() {
        return pdfInvoice;
    }

    public void setPdfInvoice(Boolean pdfInvoice) {
        this.pdfInvoice = pdfInvoice;
    }

    public Boolean getPdfDelivery() {
        return pdfDelivery;
    }

    public void setPdfDelivery(Boolean pdfDelivery) {
        this.pdfDelivery = pdfDelivery;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}