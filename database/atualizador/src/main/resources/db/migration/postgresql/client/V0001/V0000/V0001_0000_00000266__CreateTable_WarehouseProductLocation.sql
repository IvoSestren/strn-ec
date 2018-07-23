CREATE TABLE warehouseproductlocation (
  id                   CHAVE NOT NULL,
  id_product           CHAVE NOT NULL,
  id_product_attribute CHAVE NOT NULL,
  id_warehouse         CHAVE NOT NULL,
  location             CHARACTER VARYING(64),
  CONSTRAINT pk_warehouseproductlocation PRIMARY KEY (id)
);