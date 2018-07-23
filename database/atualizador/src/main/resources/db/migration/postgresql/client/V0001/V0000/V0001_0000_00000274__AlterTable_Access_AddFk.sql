ALTER TABLE access
  ADD CONSTRAINT fk_access_profile FOREIGN KEY (id_profile) REFERENCES profile (id);

ALTER TABLE access
  ADD CONSTRAINT fk_access_authorizationrole FOREIGN KEY (id_authorization_role) REFERENCES authorizationrole (id);