CREATE TABLE featureproduct (
  id               CHAVE NOT NULL,
  id_feature       CHAVE NOT NULL,
  id_product       CHAVE NOT NULL,
  id_feature_value CHAVE NOT NULL,
  CONSTRAINT pk_featureproduct PRIMARY KEY (id)
);