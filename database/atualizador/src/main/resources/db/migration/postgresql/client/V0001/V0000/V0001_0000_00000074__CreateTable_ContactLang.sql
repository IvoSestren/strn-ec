CREATE TABLE contactlang (
  id          CHAVE                 NOT NULL,
  id_contact  CHAVE                 NOT NULL,
  id_lang     CHAVE                 NOT NULL,
  name        CHARACTER VARYING(32) NOT NULL,
  description TEXT,
  CONSTRAINT pk_contactlang PRIMARY KEY (id)
);