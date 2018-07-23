CREATE TABLE module (
  id      CHAVE                 NOT NULL,
  name    CHARACTER VARYING(64) NOT NULL,
  active  BOOLEAN               NOT NULL,
  version CHARACTER VARYING(8)  NOT NULL,
  CONSTRAINT pk_module PRIMARY KEY (id)
);