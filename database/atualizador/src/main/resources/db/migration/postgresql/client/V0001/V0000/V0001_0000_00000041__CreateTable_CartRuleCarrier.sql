CREATE TABLE cartrulecarrier (
  id           CHAVE NOT NULL,
  id_cart_rule CHAVE NOT NULL,
  id_carrier   CHAVE NOT NULL,
  CONSTRAINT pk_cartrulecarrier PRIMARY KEY (id)
);