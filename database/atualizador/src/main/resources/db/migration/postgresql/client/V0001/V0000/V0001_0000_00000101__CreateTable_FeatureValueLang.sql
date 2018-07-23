CREATE TABLE featurevaluelang (
  id               CHAVE NOT NULL,
  id_feature_value CHAVE NOT NULL,
  id_lang          CHAVE NOT NULL,
  value            CHARACTER VARYING(255),
  CONSTRAINT pk_featurevaluelang PRIMARY KEY (id)
);