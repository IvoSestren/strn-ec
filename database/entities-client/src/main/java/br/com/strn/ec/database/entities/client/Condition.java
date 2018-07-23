package br.com.strn.ec.database.entities.client;

import br.com.strn.ec.database.entities.client.enums.ConditionCalculationType;
import br.com.strn.ec.database.entities.client.enums.ConditionType;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "condition")
public class Condition implements Serializable {

    private String id;
    private Condition condition;
    private ConditionType type;
    private String request;
    private String operator;
    private String value;
    private String result;
    private ConditionCalculationType calculationType;
    private String calculationDetail;
    private Boolean validated;
    private LocalDateTime dateAdd;
    private LocalDateTime dateUpd;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_ps_condition")
    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    @Enumerated(EnumType.STRING)
    public ConditionType getType() {
        return type;
    }

    public void setType(ConditionType type) {
        this.type = type;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Enumerated(EnumType.STRING)
    public ConditionCalculationType getCalculationType() {
        return calculationType;
    }

    public void setCalculationType(ConditionCalculationType calculationType) {
        this.calculationType = calculationType;
    }

    public String getCalculationDetail() {
        return calculationDetail;
    }

    public void setCalculationDetail(String calculationDetail) {
        this.calculationDetail = calculationDetail;
    }

    public Boolean getValidated() {
        return validated;
    }

    public void setValidated(Boolean validated) {
        this.validated = validated;
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
}