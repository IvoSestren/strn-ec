CREATE TABLE grouplang (
  id       CHAVE                 NOT NULL,
  id_group CHAVE                 NOT NULL,
  id_lang  CHAVE                 NOT NULL,
  name     CHARACTER VARYING(32) NOT NULL,
  CONSTRAINT pk_grouplang PRIMARY KEY (id)
);