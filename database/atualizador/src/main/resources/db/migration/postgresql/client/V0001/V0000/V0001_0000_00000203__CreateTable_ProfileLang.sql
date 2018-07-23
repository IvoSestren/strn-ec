CREATE TABLE profilelang (
  id         CHAVE                  NOT NULL,
  id_lang    CHAVE                  NOT NULL,
  id_profile CHAVE                  NOT NULL,
  name       CHARACTER VARYING(128) NOT NULL,
  CONSTRAINT pk_profilelang PRIMARY KEY (id)
);