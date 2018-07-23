CREATE TABLE orderreturndetail (
  id               CHAVE NOT NULL,
  id_order_return  CHAVE NOT NULL,
  id_order_detail  CHAVE NOT NULL,
  id_customization CHAVE NOT NULL,
  product_quantity CHAVE NOT NULL,
  CONSTRAINT pk_orderreturndetail PRIMARY KEY (id)
);