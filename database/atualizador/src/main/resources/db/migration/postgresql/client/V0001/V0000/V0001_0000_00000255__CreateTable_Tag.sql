CREATE TABLE tag (
  id      CHAVE                 NOT NULL,
  id_lang CHAVE                 NOT NULL,
  name    CHARACTER VARYING(32) NOT NULL,
  CONSTRAINT pk_tag PRIMARY KEY (id)
);