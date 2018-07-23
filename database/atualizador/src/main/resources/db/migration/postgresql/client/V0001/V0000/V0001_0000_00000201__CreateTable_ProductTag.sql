CREATE TABLE producttag (
  id         CHAVE NOT NULL,
  id_product CHAVE NOT NULL,
  id_tag     CHAVE NOT NULL,
  id_lang    CHAVE NOT NULL,
  CONSTRAINT pk_producttag PRIMARY KEY (id)
);