CREATE TABLE warehousecarrier (
  id           CHAVE NOT NULL,
  id_carrier   CHAVE NOT NULL,
  id_warehouse CHAVE NOT NULL,
  CONSTRAINT pk_warehousecarrier PRIMARY KEY (id)
);