CREATE TABLE productattributecombination (
  id                   CHAVE NOT NULL,
  id_attribute         CHAVE NOT NULL,
  id_product_attribute CHAVE NOT NULL,
  CONSTRAINT pk_productattributecombination PRIMARY KEY (id)
);