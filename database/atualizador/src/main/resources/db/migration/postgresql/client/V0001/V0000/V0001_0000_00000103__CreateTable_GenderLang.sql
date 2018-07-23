CREATE TABLE genderlang (
  id        CHAVE                 NOT NULL,
  id_gender CHAVE                 NOT NULL,
  id_lang   CHAVE                 NOT NULL,
  name      CHARACTER VARYING(20) NOT NULL,
  CONSTRAINT pk_genderlang PRIMARY KEY (id)
);