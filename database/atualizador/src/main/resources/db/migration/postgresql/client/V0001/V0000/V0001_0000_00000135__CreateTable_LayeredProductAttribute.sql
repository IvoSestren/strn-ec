CREATE TABLE layeredproductattribute (
  id                 CHAVE NOT NULL,
  id_attribute       CHAVE NOT NULL,
  id_product         CHAVE NOT NULL,
  id_attribute_group CHAVE NOT NULL,
  id_shop            CHAVE NOT NULL,
  CONSTRAINT pk_layeredproductattribute PRIMARY KEY (id)
);