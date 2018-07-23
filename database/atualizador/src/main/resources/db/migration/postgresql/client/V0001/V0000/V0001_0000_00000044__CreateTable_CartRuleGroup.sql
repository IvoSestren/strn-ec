CREATE TABLE cartrulegroup (
  id           CHAVE NOT NULL,
  id_cart_rule CHAVE NOT NULL,
  id_group     CHAVE NOT NULL,
  CONSTRAINT pk_cartrulegroup PRIMARY KEY (id)
);