package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "layeredindexableattributegrouplangvalue")
public class LayeredIndexableAttributeGroupLangValue implements Serializable {

    private String id;
    private AttributeGroup attributeGroup;
    private Lang lang;
    private String urlName;
    private String metaTile;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_lang")
    public Lang getLang() {
        return lang;
    }

    public void setLang(Lang lang) {
        this.lang = lang;
    }

    public String getUrlName() {
        return urlName;
    }

    public void setUrlName(String urlName) {
        this.urlName = urlName;
    }

    public String getMetaTile() {
        return metaTile;
    }

    public void setMetaTile(String metaTile) {
        this.metaTile = metaTile;
    }
}