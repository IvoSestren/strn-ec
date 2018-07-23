CREATE TABLE categoryshop (
  id          CHAVE NOT NULL,
  id_category CHAVE NOT NULL,
  id_shop     CHAVE NOT NULL,
  position    CHAVE NOT NULL,
  CONSTRAINT pk_categoryshop PRIMARY KEY (id)
);