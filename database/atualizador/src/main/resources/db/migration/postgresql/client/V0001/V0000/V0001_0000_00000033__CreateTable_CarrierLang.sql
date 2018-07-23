CREATE TABLE carrierlang (
  id         CHAVE NOT NULL,
  id_carrier CHAVE NOT NULL,
  id_shop    CHAVE NOT NULL,
  id_lang    CHAVE NOT NULL,
  delay      CHARACTER VARYING(512),
  CONSTRAINT pk_carrierlang PRIMARY KEY (id)
);