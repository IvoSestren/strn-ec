CREATE TABLE hookmodule (
  id        CHAVE   NOT NULL,
  id_module CHAVE   NOT NULL,
  id_shop   CHAVE   NOT NULL,
  id_hook   CHAVE   NOT NULL,
  position  INTEGER NOT NULL,
  CONSTRAINT pk_hookmodule PRIMARY KEY (id)
);