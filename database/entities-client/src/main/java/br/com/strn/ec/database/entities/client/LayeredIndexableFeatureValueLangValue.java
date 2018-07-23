package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "layeredindexablefeaturevaluelangvalue")
public class LayeredIndexableFeatureValueLangValue implements Serializable {

    private String id;
    private FeatureValue featureValue;
    private Lang lang;
    private String urlName;
    private String metaTitle;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_feature_value")
    public FeatureValue getFeatureValue() {
        return featureValue;
    }

    public void setFeatureValue(FeatureValue featureValue) {
        this.featureValue = featureValue;
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

    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }
}