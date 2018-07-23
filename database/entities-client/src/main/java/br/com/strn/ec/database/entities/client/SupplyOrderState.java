package br.com.strn.ec.database.entities.client;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "supplyorderstate")
public class SupplyOrderState implements Serializable {

    private String id;
    private Boolean deliveryNote;
    private Boolean editable;
    private Boolean receiptState;
    private Boolean pendingReceipt;
    private Boolean enclosed;
    private String color;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getDeliveryNote() {
        return deliveryNote;
    }

    public void setDeliveryNote(Boolean deliveryNote) {
        this.deliveryNote = deliveryNote;
    }

    public Boolean getEditable() {
        return editable;
    }

    public void setEditable(Boolean editable) {
        this.editable = editable;
    }

    public Boolean getReceiptState() {
        return receiptState;
    }

    public void setReceiptState(Boolean receiptState) {
        this.receiptState = receiptState;
    }

    public Boolean getPendingReceipt() {
        return pendingReceipt;
    }

    public void setPendingReceipt(Boolean pendingReceipt) {
        this.pendingReceipt = pendingReceipt;
    }

    public Boolean getEnclosed() {
        return enclosed;
    }

    public void setEnclosed(Boolean enclosed) {
        this.enclosed = enclosed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}