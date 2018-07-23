CREATE TABLE featurelang (
  id         CHAVE NOT NULL,
  id_feature CHAVE NOT NULL,
  id_lang    CHAVE NOT NULL,
  name       CHARACTER VARYING(128),
  CONSTRAINT pk_featurelang PRIMARY KEY (id)
);