CREATE TABLE modulecurrency (
  id          CHAVE NOT NULL,
  id_module   CHAVE NOT NULL,
  id_shop     CHAVE NOT NULL,
  id_currency CHAVE NOT NULL,
  CONSTRAINT pk_modulecurrency PRIMARY KEY (id)
);