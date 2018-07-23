CREATE TABLE delivery (
  id              CHAVE          NOT NULL,
  id_shop         CHAVE,
  id_shop_group   CHAVE,
  id_carrier      CHAVE          NOT NULL,
  id_range_price  CHAVE,
  id_range_weight CHAVE,
  id_zone         CHAVE          NOT NULL,
  price           DECIMAL(20, 6) NOT NULL,
  CONSTRAINT pk_delivery PRIMARY KEY (id)
);