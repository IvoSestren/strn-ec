CREATE TABLE zone (
  id     CHAVE                 NOT NULL,
  name   CHARACTER VARYING(64) NOT NULL,
  active BOOLEAN               NOT NULL,
  CONSTRAINT pk_zone PRIMARY KEY (id)
);