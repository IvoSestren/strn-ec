CREATE TABLE productattributeimage (
  id                   CHAVE NOT NULL,
  id_product_attribute CHAVE NOT NULL,
  id_image             CHAVE NOT NULL,
  CONSTRAINT pk_productattributeimage PRIMARY KEY (id)
);