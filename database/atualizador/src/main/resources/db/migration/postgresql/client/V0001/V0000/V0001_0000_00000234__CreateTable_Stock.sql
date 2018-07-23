CREATE TABLE stock (
  id                   CHAVE                 NOT NULL,
  id_warehouse         CHAVE                 NOT NULL,
  id_product           CHAVE                 NOT NULL,
  id_product_attribute CHAVE                 NOT NULL,
  reference            CHARACTER VARYING(32) NOT NULL,
  ean13                CHARACTER VARYING(13),
  isbn                 CHARACTER VARYING(32),
  upc                  CHARACTER VARYING(12),
  physical_quantity    CHAVE                 NOT NULL,
  usable_quantity      CHAVE                 NOT NULL,
  price_te             DECIMAL(20, 6),
  CONSTRAINT pk_stock PRIMARY KEY (id)
);