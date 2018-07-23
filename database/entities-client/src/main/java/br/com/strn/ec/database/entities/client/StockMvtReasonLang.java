package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "stockmvtreasonlang")
public class StockMvtReasonLang implements Serializable {

    private String id;
    private StockMvtReason stockMvtReason;
    private Lang lang;
    private String name;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_stock_mvt_reaso")
    public StockMvtReason getStockMvtReason() {
        return stockMvtReason;
    }

    public void setStockMvtReason(StockMvtReason stockMvtReason) {
        this.stockMvtReason = stockMvtReason;
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
}