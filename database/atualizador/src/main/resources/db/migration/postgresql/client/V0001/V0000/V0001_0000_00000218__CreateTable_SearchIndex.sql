CREATE TABLE searchindex (
  id         chave   NOT NULL,
  id_product chave   not null,
  id_word    chave   not null,
  weight     integer not null,
  CONSTRAINT pk_searchindex PRIMARY KEY (id)
);