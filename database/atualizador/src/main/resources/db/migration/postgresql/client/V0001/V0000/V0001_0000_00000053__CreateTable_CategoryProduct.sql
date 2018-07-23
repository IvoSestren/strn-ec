CREATE TABLE categoryproduct (
  id          CHAVE   NOT NULL,
  id_category CHAVE   NOT NULL,
  id_product  CHAVE   NOT NULL,
  position    INTEGER NOT NULL,
  CONSTRAINT pk_categoryproduct PRIMARY KEY (id)
);