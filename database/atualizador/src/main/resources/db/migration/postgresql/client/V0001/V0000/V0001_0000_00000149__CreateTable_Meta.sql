CREATE TABLE meta (
  id           CHAVE                 NOT NULL,
  page         CHARACTER VARYING(64) NOT NULL,
  configurable BOOLEAN               NOT NULL,
  CONSTRAINT pk_meta PRIMARY KEY (id)
);