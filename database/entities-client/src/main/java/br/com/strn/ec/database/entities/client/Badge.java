package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "badge")
public class Badge implements Serializable {

    private String id;
    private Badge badge;
    private String type;
    private Group group;
    private Integer groupPosition;
    private Integer scoring;
    private Integer awb;
    private Boolean validated;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_badge")
    public Badge getBadge() {
        return badge;
    }

    public void setBadge(Badge badge) {
        this.badge = badge;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_group")
    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Integer getGroupPosition() {
        return groupPosition;
    }

    public void setGroupPosition(Integer groupPosition) {
        this.groupPosition = groupPosition;
    }

    public Integer getScoring() {
        return scoring;
    }

    public void setScoring(Integer scoring) {
        this.scoring = scoring;
    }

    public Integer getAwb() {
        return awb;
    }

    public void setAwb(Integer awb) {
        this.awb = awb;
    }

    public Boolean getValidated() {
        return validated;
    }

    public void setValidated(Boolean validated) {
        this.validated = validated;
    }
}