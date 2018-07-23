package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "orderreturndetail")
public class OrderReturnDetail implements Serializable {

    private String id;
    private OrderReturn orderReturn;
    private OrderDetail orderDetail;
    private Customization customization;
    private Integer productQuantity;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_order_return")
    public OrderReturn getOrderReturn() {
        return orderReturn;
    }

    public void setOrderReturn(OrderReturn orderReturn) {
        this.orderReturn = orderReturn;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_order_detail")
    public OrderDetail getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(OrderDetail orderDetail) {
        this.orderDetail = orderDetail;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_customization")
    public Customization getCustomization() {
        return customization;
    }

    public void setCustomization(Customization customization) {
        this.customization = customization;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }
}