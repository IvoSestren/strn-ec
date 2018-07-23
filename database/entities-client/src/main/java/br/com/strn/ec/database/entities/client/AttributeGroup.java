package br.com.strn.ec.database.entities.client;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "attributegroup")
public class AttributeGroup implements Serializable {

    private String id;
    private Boolean isColorGroup;
    private String groupType;
    private Integer position;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getColorGroup() {
        return isColorGroup;
    }

    public void setColorGroup(Boolean colorGroup) {
        isColorGroup = colorGroup;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
}