CREATE TABLE stockavailable (
  id                   CHAVE   NOT NULL,
  id_product           CHAVE   NOT NULL,
  id_product_attribute CHAVE   NOT NULL,
  id_shop              CHAVE   NOT NULL,
  id_shop_group        CHAVE   NOT NULL,
  quantity             INTEGER NOT NULL,
  physical_quantity    INTEGER NOT NULL,
  reserved_quantity    INTEGER NOT NULL,
  depends_on_stock     BOOLEAN NOT NULL,
  out_of_stock         BOOLEAN NOT NULL,
  CONSTRAINT pk_stockavailable PRIMARY KEY (id)
);