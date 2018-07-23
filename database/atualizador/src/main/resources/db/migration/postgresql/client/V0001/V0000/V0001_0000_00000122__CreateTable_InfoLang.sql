CREATE TABLE infolang (
  id      CHAVE NOT NULL,
  id_info CHAVE NOT NULL,
  id_lang CHAVE NOT NULL,
  text    TEXT  NOT NULL,
  CONSTRAINT pk_infolang PRIMARY KEY (id)
);