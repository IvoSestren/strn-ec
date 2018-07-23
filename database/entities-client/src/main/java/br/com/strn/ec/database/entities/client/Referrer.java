package br.com.strn.ec.database.entities.client;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "referrer")
public class Referrer implements Serializable {

    private String id;
    private String name;
    private String password;
    private String httpRefererRegexp;
    private String httpRefererLike;
    private String requestUriRegexp;
    private String requestUriLike;
    private String httpRefererRegexpNot;
    private String httpRefererLikeNot;
    private String requestUriRegexpNot;
    private String requestUriLikeNot;
    private BigDecimal baseFee;
    private BigDecimal percentFee;
    private BigDecimal clickFee;
    private LocalDateTime dateAdd;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHttpRefererRegexp() {
        return httpRefererRegexp;
    }

    public void setHttpRefererRegexp(String httpRefererRegexp) {
        this.httpRefererRegexp = httpRefererRegexp;
    }

    public String getHttpRefererLike() {
        return httpRefererLike;
    }

    public void setHttpRefererLike(String httpRefererLike) {
        this.httpRefererLike = httpRefererLike;
    }

    public String getRequestUriRegexp() {
        return requestUriRegexp;
    }

    public void setRequestUriRegexp(String requestUriRegexp) {
        this.requestUriRegexp = requestUriRegexp;
    }

    public String getRequestUriLike() {
        return requestUriLike;
    }

    public void setRequestUriLike(String requestUriLike) {
        this.requestUriLike = requestUriLike;
    }

    public String getHttpRefererRegexpNot() {
        return httpRefererRegexpNot;
    }

    public void setHttpRefererRegexpNot(String httpRefererRegexpNot) {
        this.httpRefererRegexpNot = httpRefererRegexpNot;
    }

    public String getHttpRefererLikeNot() {
        return httpRefererLikeNot;
    }

    public void setHttpRefererLikeNot(String httpRefererLikeNot) {
        this.httpRefererLikeNot = httpRefererLikeNot;
    }

    public String getRequestUriRegexpNot() {
        return requestUriRegexpNot;
    }

    public void setRequestUriRegexpNot(String requestUriRegexpNot) {
        this.requestUriRegexpNot = requestUriRegexpNot;
    }

    public String getRequestUriLikeNot() {
        return requestUriLikeNot;
    }

    public void setRequestUriLikeNot(String requestUriLikeNot) {
        this.requestUriLikeNot = requestUriLikeNot;
    }

    public BigDecimal getBaseFee() {
        return baseFee;
    }

    public void setBaseFee(BigDecimal baseFee) {
        this.baseFee = baseFee;
    }

    public BigDecimal getPercentFee() {
        return percentFee;
    }

    public void setPercentFee(BigDecimal percentFee) {
        this.percentFee = percentFee;
    }

    public BigDecimal getClickFee() {
        return clickFee;
    }

    public void setClickFee(BigDecimal clickFee) {
        this.clickFee = clickFee;
    }

    public LocalDateTime getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(LocalDateTime dateAdd) {
        this.dateAdd = dateAdd;
    }
}