CREATE TABLE currencyshop (
  id              CHAVE          NOT NULL,
  id_currency     CHAVE          NOT NULL,
  id_shop         CHAVE          NOT NULL,
  conversion_rate DECIMAL(13, 6) NOT NULL,
  CONSTRAINT pk_currencyshop PRIMARY KEY (id)
);