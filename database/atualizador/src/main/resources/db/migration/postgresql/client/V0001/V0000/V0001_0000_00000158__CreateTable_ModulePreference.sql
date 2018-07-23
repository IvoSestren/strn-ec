CREATE TABLE modulepreference (
  id          CHAVE                  NOT NULL,
  id_employee CHAVE                  NOT NULL,
  module      CHARACTER VARYING(255) NOT NULL,
  interest    BOOLEAN,
  favorite    BOOLEAN,
  CONSTRAINT pk_modulepreference PRIMARY KEY (id)
);