package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "linkblocklang")
public class LinkBlockLang implements Serializable {

    private String id;
    private LinkBlock linkBlock;
    private Lang lang;
    private String name;
    private String customContent;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_link_block")
    public LinkBlock getLinkBlock() {
        return linkBlock;
    }

    public void setLinkBlock(LinkBlock linkBlock) {
        this.linkBlock = linkBlock;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_lang")
    public Lang getLang() {
        return lang;
    }

    public void setLang(Lang lang) {
        this.lang = lang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomContent() {
        return customContent;
    }

    public void setCustomContent(String customContent) {
        this.customContent = customContent;
    }
}