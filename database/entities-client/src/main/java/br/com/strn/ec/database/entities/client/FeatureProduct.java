package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "featureproduct")
public class FeatureProduct implements Serializable {

    private String id;
    private Feature feature;
    private Product product;
    private FeatureValue featureValue;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_product")
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_feature_value")
    public FeatureValue getFeatureValue() {
        return featureValue;
    }

    public void setFeatureValue(FeatureValue featureValue) {
        this.featureValue = featureValue;
    }
}