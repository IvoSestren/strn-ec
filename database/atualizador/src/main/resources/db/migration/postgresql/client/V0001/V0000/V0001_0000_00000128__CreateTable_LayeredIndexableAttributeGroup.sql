CREATE TABLE layeredindexableattributegroup (
  id                 CHAVE   NOT NULL,
  id_attribute_group CHAVE   NOT NULL,
  indexable          BOOLEAN NOT NULL,
  CONSTRAINT pk_layeredindexableattributegroup PRIMARY KEY (id)
);