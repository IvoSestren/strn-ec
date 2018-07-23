CREATE TABLE imageshop (
  id         CHAVE NOT NULL,
  id_product CHAVE NOT NULL,
  id_image   CHAVE NOT NULL,
  id_shop    CHAVE NOT NULL,
  cover      BOOLEAN,
  CONSTRAINT pk_imageshop PRIMARY KEY (id)
);