CREATE TABLE groupreduction (
  id          CHAVE         NOT NULL,
  id_group    CHAVE         NOT NULL,
  id_category CHAVE         NOT NULL,
  reduction   DECIMAL(4, 3) NOT NULL,
  CONSTRAINT pk_groupreduction PRIMARY KEY (id)
);