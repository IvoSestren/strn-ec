CREATE TABLE risklang (
  id      CHAVE                 NOT NULL,
  id_risk CHAVE                 NOT NULL,
  id_lang CHAVE                 NOT NULL,
  name    CHARACTER VARYING(20) NOT NULL,
  CONSTRAINT pk_risklang PRIMARY KEY (id)
);