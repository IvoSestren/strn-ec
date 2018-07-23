CREATE TABLE productcountrytax (
  id         CHAVE NOT NULL,
  id_product CHAVE NOT NULL,
  id_country CHAVE NOT NULL,
  id_tax     CHAVE NOT NULL,
  CONSTRAINT pk_productcountrytax PRIMARY KEY (id)
);