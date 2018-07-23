CREATE TABLE customization (
  id                   CHAVE   NOT NULL,
  id_product_attribute CHAVE   NOT NULL,
  id_address_delivery  CHAVE   NOT NULL,
  id_cart              CHAVE   NOT NULL,
  id_product           CHAVE   NOT NULL,
  quantity             INTEGER NOT NULL,
  quantity_refunded    INTEGER NOT NULL,
  quantity_returned    INTEGER NOT NULL,
  in_cart              BOOLEAN NOT NULL,
  CONSTRAINT pk_customization PRIMARY KEY (id)
);