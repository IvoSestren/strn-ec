CREATE TABLE productsale (
  id         CHAVE NOT NULL,
  id_product CHAVE NOT NULL,
  quantity   CHAVE NOT NULL,
  sale_nbr   CHAVE NOT NULL,
  date_upd   TIMESTAMP WITH TIME ZONE,
  CONSTRAINT pk_productsale PRIMARY KEY (id)
);