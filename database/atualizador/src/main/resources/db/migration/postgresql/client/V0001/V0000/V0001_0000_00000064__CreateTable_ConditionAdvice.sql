CREATE TABLE conditionadvice (
  id           CHAVE   NOT NULL,
  id_condition CHAVE   NOT NULL,
  id_advice    CHAVE   NOT NULL,
  display      BOOLEAN NOT NULL,
  CONSTRAINT pk_conditionadvice PRIMARY KEY (id)
);