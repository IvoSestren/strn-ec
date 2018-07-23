CREATE TABLE moduleaccess (
  id                    CHAVE NOT NULL,
  id_profile            CHAVE NOT NULL,
  id_authorization_role CHAVE NOT NULL,
  CONSTRAINT pk_moduleaccess PRIMARY KEY (id)
);