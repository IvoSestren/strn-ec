CREATE TABLE hookmoduleexceptions (
  id        CHAVE NOT NULL,
  id_shop   CHAVE NOT NULL,
  id_module CHAVE NOT NULL,
  id_hook   CHAVE NOT NULL,
  file_name CHARACTER VARYING(255),
  CONSTRAINT pk_hookmoduleexceptions PRIMARY KEY (id)
);