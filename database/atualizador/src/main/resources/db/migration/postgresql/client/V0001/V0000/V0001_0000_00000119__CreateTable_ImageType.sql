CREATE TABLE imagetype (
  id            CHAVE                 NOT NULL,
  name          CHARACTER VARYING(64) NOT NULL,
  width         INTEGER               NOT NULL,
  height        INTEGER               NOT NULL,
  products      BOOLEAN               NOT NULL,
  categories    BOOLEAN               NOT NULL,
  manufacturers BOOLEAN               NOT NULL,
  suppliers     BOOLEAN               NOT NULL,
  stores        BOOLEAN               NOT NULL,
  CONSTRAINT pk_imagetype PRIMARY KEY (id)
);