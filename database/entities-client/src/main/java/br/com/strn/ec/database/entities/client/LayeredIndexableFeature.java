package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "layeredindexablefeature")
public class LayeredIndexableFeature implements Serializable {

    private String id;
    private Feature feature;
    private Boolean indexable;

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

    public Boolean getIndexable() {
        return indexable;
    }

    public void setIndexable(Boolean indexable) {
        this.indexable = indexable;
    }
}