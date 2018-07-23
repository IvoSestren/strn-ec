CREATE TABLE tagcount (
  id       CHAVE   NOT NULL,
  id_group CHAVE   NOT NULL,
  id_tag   CHAVE   NOT NULL,
  id_lang  CHAVE   NOT NULL,
  id_shop  CHAVE   NOT NULL,
  counter  INTEGER NOT NULL,
  CONSTRAINT pk_tagcount PRIMARY KEY (id)
);