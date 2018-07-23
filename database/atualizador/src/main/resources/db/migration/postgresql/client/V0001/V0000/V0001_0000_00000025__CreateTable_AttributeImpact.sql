CREATE TABLE attributeimpact (
  id           CHAVE          NOT NULL,
  id_product   CHAVE          NOT NULL,
  id_attribute CHAVE          NOT NULL,
  weight       DECIMAL(20, 6) NOT NULL,
  price        DECIMAL(17, 2) NOT NULL,
  CONSTRAINT pk_attributeimpact PRIMARY KEY (id)
);