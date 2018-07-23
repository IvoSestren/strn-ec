package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "linkblock")
public class LinkBlock implements Serializable {

    private String id;
    private Hook hook;
    private Integer position;
    private String content;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_hook")
    public Hook getHook() {
        return hook;
    }

    public void setHook(Hook hook) {
        this.hook = hook;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}