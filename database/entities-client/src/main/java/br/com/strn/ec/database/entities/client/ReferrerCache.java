package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "referrercache")
public class ReferrerCache implements Serializable {

    private String id;
    private ConnectionsSource connectionsSource;
    private Referrer referrer;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_connections_source")
    public ConnectionsSource getConnectionsSource() {
        return connectionsSource;
    }

    public void setConnectionsSource(ConnectionsSource connectionsSource) {
        this.connectionsSource = connectionsSource;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_referrer")
    public Referrer getReferrer() {
        return referrer;
    }

    public void setReferrer(Referrer referrer) {
        this.referrer = referrer;
    }
}