package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "reassurancelang")
public class ReassuranceLang implements Serializable {

    private String id;
    private Reassurance reassurance;
    private Lang lang;
    private String text;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_reassurance")
    public Reassurance getReassurance() {
        return reassurance;
    }

    public void setReassurance(Reassurance reassurance) {
        this.reassurance = reassurance;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_lang")
    public Lang getLang() {
        return lang;
    }

    public void setLang(Lang lang) {
        this.lang = lang;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}