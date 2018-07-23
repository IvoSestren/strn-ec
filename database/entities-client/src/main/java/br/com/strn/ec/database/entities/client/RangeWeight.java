package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "rangeweight")
public class RangeWeight implements Serializable {

    private String id;
    private Carrier carrier;
    private BigDecimal delimiter1;
    private BigDecimal delimiter2;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_carrier")
    public Carrier getCarrier() {
        return carrier;
    }

    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }

    public BigDecimal getDelimiter1() {
        return delimiter1;
    }

    public void setDelimiter1(BigDecimal delimiter1) {
        this.delimiter1 = delimiter1;
    }

    public BigDecimal getDelimiter2() {
        return delimiter2;
    }

    public void setDelimiter2(BigDecimal delimiter2) {
        this.delimiter2 = delimiter2;
    }
}