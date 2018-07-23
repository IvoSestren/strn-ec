CREATE TABLE searchword (
  id      chave                 NOT NULL,
  id_shop chave                 NOT NULL,
  id_lang chave                 NOT NULL,
  word    character varying(15) NOT NULL,
  CONSTRAINT pk_searchword PRIMARY KEY (id)
);