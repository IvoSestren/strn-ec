package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "connectionspage")
public class ConnectionsPage implements Serializable {

    private String id;
    private Connections connections;
    private Page page;
    private LocalDateTime timeStart;
    private LocalDateTime timeEnd;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_connections")
    public Connections getConnections() {
        return connections;
    }

    public void setConnections(Connections connections) {
        this.connections = connections;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_page")
    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public LocalDateTime getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(LocalDateTime timeStart) {
        this.timeStart = timeStart;
    }

    public LocalDateTime getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(LocalDateTime timeEnd) {
        this.timeEnd = timeEnd;
    }
}