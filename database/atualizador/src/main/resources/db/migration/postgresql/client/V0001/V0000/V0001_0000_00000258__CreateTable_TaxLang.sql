CREATE TABLE taxlang (
  id      CHAVE                 NOT NULL,
  id_tax  CHAVE                 NOT NULL,
  id_lang CHAVE                 NOT NULL,
  name    CHARACTER VARYING(32) NOT NULL,
  CONSTRAINT pk_taxlang PRIMARY KEY (id)
);