CREATE TABLE badgelang (
  id          CHAVE NOT NULL,
  id_badge    CHAVE NOT NULL,
  id_lang     CHAVE NOT NULL,
  name        CHARACTER VARYING(64),
  description CHARACTER VARYING(255),
  group_name  CHARACTER VARYING(255),
  CONSTRAINT pk_badgelang PRIMARY KEY (id)
);