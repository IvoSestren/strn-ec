CREATE TABLE tablang (
  id      CHAVE                  NOT NULL,
  id_tab  CHAVE                  NOT NULL,
  id_lang CHAVE                  NOT NULL,
  name    CHARACTER VARYING(128) NOT NULL,
  CONSTRAINT pk_tablang PRIMARY KEY (id)
);