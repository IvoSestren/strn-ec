CREATE TABLE tax (
  id      CHAVE          NOT NULL,
  rate    DECIMAL(10, 3) NOT NULL,
  active  BOOLEAN        NOT NULL,
  deleted BOOLEAN        NOT NULL,
  CONSTRAINT pk_tax PRIMARY KEY (id)
);