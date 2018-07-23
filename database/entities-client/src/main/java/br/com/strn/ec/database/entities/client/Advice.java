package br.com.strn.ec.database.entities.client;

import br.com.strn.ec.database.entities.client.enums.AdviceLocation;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "advice")
public class Advice implements Serializable {

    private String id;
    private Advice advice;
    private Tab tab;
    private String idsTab;
    private Boolean validated;
    private Boolean hide;
    private AdviceLocation location;
    private String selector;
    private Integer startDay;
    private Integer stopDay;
    private Integer weight;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_ps_advice")
    public Advice getAdvice() {
        return advice;
    }

    public void setAdvice(Advice advice) {
        this.advice = advice;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tab")
    public Tab getTab() {
        return tab;
    }

    public void setTab(Tab tab) {
        this.tab = tab;
    }

    public String getIdsTab() {
        return idsTab;
    }

    public void setIdsTab(String idsTab) {
        this.idsTab = idsTab;
    }

    public Boolean getValidated() {
        return validated;
    }

    public void setValidated(Boolean validated) {
        this.validated = validated;
    }

    public Boolean getHide() {
        return hide;
    }

    public void setHide(Boolean hide) {
        this.hide = hide;
    }

    @Enumerated(EnumType.STRING)
    public AdviceLocation getLocation() {
        return location;
    }

    public void setLocation(AdviceLocation location) {
        this.location = location;
    }

    public String getSelector() {
        return selector;
    }

    public void setSelector(String selector) {
        this.selector = selector;
    }

    public Integer getStartDay() {
        return startDay;
    }

    public void setStartDay(Integer startDay) {
        this.startDay = startDay;
    }

    public Integer getStopDay() {
        return stopDay;
    }

    public void setStopDay(Integer stopDay) {
        this.stopDay = stopDay;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}