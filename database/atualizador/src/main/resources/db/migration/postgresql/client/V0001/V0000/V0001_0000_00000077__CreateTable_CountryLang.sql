CREATE TABLE countrylang (
  id         chave                 NOT NULL,
  id_country chave                 NOT NULL,
  id_lang    chave                 NOT NULL,
  name       character varying(64) NOT NULL,
  CONSTRAINT pk_countrylang PRIMARY KEY (id)
);