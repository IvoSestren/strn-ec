CREATE TABLE productsupplier (
  id                         CHAVE          NOT NULL,
  id_product                 CHAVE          NOT NULL,
  id_product_attribute       CHAVE          NOT NULL,
  id_supplier                CHAVE          NOT NULL,
  product_supplier_reference CHARACTER VARYING(32),
  product_supplier_price_te  DECIMAL(20, 6) NOT NULL,
  id_currency                CHAVE          NOT NULL,
  CONSTRAINT pk_productsupplier PRIMARY KEY (id)
);