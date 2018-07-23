CREATE TABLE currency (
  id              CHAVE                 NOT NULL,
  name            CHARACTER VARYING(64) NOT NULL,
  iso_code        CHARACTER VARYING(3)  NOT NULL,
  conversion_rate DECIMAL(13, 6)        NOT NULL,
  deleted         BOOLEAN               NOT NULL,
  active          BOOLEAN               NOT NULL,
  CONSTRAINT pk_currency PRIMARY KEY (id)
);