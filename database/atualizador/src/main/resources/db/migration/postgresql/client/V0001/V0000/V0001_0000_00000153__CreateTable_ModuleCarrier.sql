CREATE TABLE modulecarrier (
  id           CHAVE NOT NULL,
  id_module    CHAVE NOT NULL,
  id_shop      CHAVE NOT NULL,
  id_reference CHAVE NOT NULL,
  CONSTRAINT pk_modulecarrier PRIMARY KEY (id)
);