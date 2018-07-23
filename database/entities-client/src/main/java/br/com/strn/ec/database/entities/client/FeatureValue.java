package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "featurevalue")
public class FeatureValue implements Serializable {

    private String id;
    private Feature feature;
    private Integer custom;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_feature")
    public Feature getFeature() {
        return feature;
    }

    public void setFeature(Feature feature) {
        this.feature = feature;
    }

    public Integer getCustom() {
        return custom;
    }

    public void setCustom(Integer custom) {
        this.custom = custom;
    }
}