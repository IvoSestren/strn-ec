package br.com.strn.ec.database.entities.master;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "syscontract")
public class SysContract implements Serializable {

    private String id;
    private SysClient client;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Boolean active;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_sysclient")
    public SysClient getClient() {
        return client;
    }

    public void setClient(SysClient client) {
        this.client = client;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
