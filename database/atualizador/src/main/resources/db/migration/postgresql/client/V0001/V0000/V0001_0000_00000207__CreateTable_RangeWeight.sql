CREATE TABLE rangeweight (
  id         CHAVE          NOT NULL,
  id_carrier CHAVE          NOT NULL,
  delimiter1 DECIMAL(20, 6) NOT NULL,
  delimiter2 DECIMAL(20, 6) NOT NULL,
  CONSTRAINT pk_rangeweight PRIMARY KEY (id)
);