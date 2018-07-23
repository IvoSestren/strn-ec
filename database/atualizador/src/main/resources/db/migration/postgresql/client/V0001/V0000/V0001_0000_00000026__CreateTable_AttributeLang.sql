CREATE TABLE attributelang (
  id           CHAVE                  NOT NULL,
  id_attribute CHAVE                  NOT NULL,
  id_lang      CHAVE                  NOT NULL,
  name         CHARACTER VARYING(128) NOT NULL,
  CONSTRAINT pk_attributelang PRIMARY KEY (id)
);