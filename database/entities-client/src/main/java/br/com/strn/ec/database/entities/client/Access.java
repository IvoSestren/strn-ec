package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "access")
public class Access implements Serializable {

	private String id;
	private Profile profile;
    private AuthorizationRole authorizationRole;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_profile")
    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_authorization_role")
    public AuthorizationRole getAuthorizationRole() {
        return authorizationRole;
    }

    public void setAuthorizationRole(AuthorizationRole authorizationRole) {
        this.authorizationRole = authorizationRole;
    }
}