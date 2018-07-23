CREATE TABLE customergroup (
  id          CHAVE NOT NULL,
  id_customer CHAVE NOT NULL,
  id_group    CHAVE NOT NULL,
  CONSTRAINT pk_customergroup PRIMARY KEY (id)
);