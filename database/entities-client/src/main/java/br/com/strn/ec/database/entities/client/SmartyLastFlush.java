package br.com.strn.ec.database.entities.client;

import br.com.strn.ec.database.entities.client.enums.SmartyLastFlushType;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "smartylastflush")
public class SmartyLastFlush implements Serializable {

    private String id;
    private SmartyLastFlushType type;
    private LocalDateTime lashFlush;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Enumerated(EnumType.STRING)
    public SmartyLastFlushType getType() {
        return type;
    }

    public void setType(SmartyLastFlushType type) {
        this.type = type;
    }

    public LocalDateTime getLashFlush() {
        return lashFlush;
    }

    public void setLashFlush(LocalDateTime lashFlush) {
        this.lashFlush = lashFlush;
    }
}