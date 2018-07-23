CREATE TABLE access (
  id                    CHAVE NOT NULL,
  id_profile            CHAVE NOT NULL,
  id_authorization_role CHAVE NOT NULL,
  CONSTRAINT pk_access PRIMARY KEY (id)
);