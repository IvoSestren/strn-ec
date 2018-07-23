CREATE TABLE customizationfield (
  id         CHAVE   NOT NULL,
  id_product CHAVE   NOT NULL,
  type       INTEGER NOT NULL,
  required   BOOLEAN NOT NULL,
  is_module  BOOLEAN NOT NULL,
  is_deleted BOOLEAN NOT NULL,
  CONSTRAINT pk_customizationfield PRIMARY KEY (id)
);