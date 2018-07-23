CREATE TABLE productcarrier (
  id                   CHAVE NOT NULL,
  id_product           CHAVE NOT NULL,
  id_carrier_reference CHAVE NOT NULL,
  id_shop              CHAVE NOT NULL,
  CONSTRAINT pk_productcarrier PRIMARY KEY (id)
);