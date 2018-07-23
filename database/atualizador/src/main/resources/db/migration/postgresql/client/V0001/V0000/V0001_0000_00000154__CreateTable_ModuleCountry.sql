CREATE TABLE modulecountry (
  id         CHAVE NOT NULL,
  id_module  CHAVE NOT NULL,
  id_shop    CHAVE NOT NULL,
  id_country CHAVE NOT NULL,
  CONSTRAINT pk_modulecountry PRIMARY KEY (id)
);