CREATE TABLE customizationfieldlang (
  id                     CHAVE                  NOT NULL,
  id_customization_field CHAVE                  NOT NULL,
  id_lang                CHAVE                  NOT NULL,
  id_shop                CHAVE                  NOT NULL,
  name                   CHARACTER VARYING(255) NOT NULL,
  CONSTRAINT pk_customizationfieldlang PRIMARY KEY (id)
);