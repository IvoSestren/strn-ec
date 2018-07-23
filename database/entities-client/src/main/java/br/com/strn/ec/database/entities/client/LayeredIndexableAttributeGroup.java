package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "layeredindexableattributegroup")
public class LayeredIndexableAttributeGroup implements Serializable {

    private String id;
    private AttributeGroup attributeGroup;
    private Boolean indexable;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_attribute_group")
    public AttributeGroup getAttributeGroup() {
        return attributeGroup;
    }

    public void setAttributeGroup(AttributeGroup attributeGroup) {
        this.attributeGroup = attributeGroup;
    }

    public Boolean getIndexable() {
        return indexable;
    }

    public void setIndexable(Boolean indexable) {
        this.indexable = indexable;
    }
}