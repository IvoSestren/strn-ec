CREATE TABLE cartruleproductrulevalue (
  id              CHAVE NOT NULL,
  id_product_rule CHAVE NOT NULL,
  id_item         CHAVE NOT NULL,
  CONSTRAINT pk_cartruleproductrulevalue PRIMARY KEY (id)
);