CREATE TABLE cartruleproductrulegroup (
  id                    CHAVE   NOT NULL,
  id_product_rule_group CHAVE   NOT NULL,
  id_cart_rule          CHAVE   NOT NULL,
  quantity              INTEGER NOT NULL,
  CONSTRAINT pk_cartruleproductrulegroup PRIMARY KEY (id)
);