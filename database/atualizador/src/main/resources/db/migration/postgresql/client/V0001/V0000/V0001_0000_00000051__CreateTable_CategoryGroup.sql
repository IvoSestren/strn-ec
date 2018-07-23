CREATE TABLE categorygroup (
  id          CHAVE NOT NULL,
  id_category CHAVE NOT NULL,
  id_group    CHAVE NOT NULL,
  CONSTRAINT pk_categorygroup PRIMARY KEY (id)
);