package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "homesliderslideslang")
public class HomesliderSlidesLang implements Serializable {

    private String id;
    private HomesliderSlides homesliderSlides;
    private Lang lang;
    private String title;
    private String description;
    private String legend;
    private String url;
    private String image;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_homeslider_slides")
    public HomesliderSlides getHomesliderSlides() {
        return homesliderSlides;
    }

    public void setHomesliderSlides(HomesliderSlides homesliderSlides) {
        this.homesliderSlides = homesliderSlides;
    }

    public Lang getLang() {
        return lang;
    }

    public void setLang(Lang lang) {
        this.lang = lang;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLegend() {
        return legend;
    }

    public void setLegend(String legend) {
        this.legend = legend;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}