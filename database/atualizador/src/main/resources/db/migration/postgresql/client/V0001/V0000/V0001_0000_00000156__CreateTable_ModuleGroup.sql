CREATE TABLE modulegroup (
  id        CHAVE NOT NULL,
  id_module CHAVE NOT NULL,
  id_shop   CHAVE NOT NULL,
  id_group  CHAVE NOT NULL,
  CONSTRAINT pk_modulegroup PRIMARY KEY (id)
);