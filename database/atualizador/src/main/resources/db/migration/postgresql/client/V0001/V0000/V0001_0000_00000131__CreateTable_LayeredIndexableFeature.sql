CREATE TABLE layeredindexablefeature (
  id         CHAVE   NOT NULL,
  id_feature CHAVE   NOT NULL,
  indexable  BOOLEAN NOT NULL,
  CONSTRAINT pk_layeredindexablefeature PRIMARY KEY (id)
);