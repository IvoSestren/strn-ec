CREATE TABLE layeredpriceindex (
  id          CHAVE   NOT NULL,
  id_product  CHAVE   NOT NULL,
  id_currency CHAVE   NOT NULL,
  id_shop     CHAVE   NOT NULL,
  price_min   INTEGER NOT NULL,
  price_max   INTEGER NOT NULL,
  CONSTRAINT pk_layeredpriceindex PRIMARY KEY (id)
);