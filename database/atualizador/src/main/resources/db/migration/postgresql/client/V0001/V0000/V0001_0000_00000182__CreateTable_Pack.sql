CREATE TABLE pack (
  id                        CHAVE NOT NULL,
  id_product_pack           CHAVE NOT NULL,
  id_product_item           CHAVE NOT NULL,
  id_product_attribute_item CHAVE NOT NULL,
  quantity                  CHAVE NOT NULL,
  CONSTRAINT pk_pack PRIMARY KEY (id)
);