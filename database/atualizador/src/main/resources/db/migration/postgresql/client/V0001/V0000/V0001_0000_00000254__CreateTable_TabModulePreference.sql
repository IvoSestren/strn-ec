CREATE TABLE tabmodulepreference (
  id          CHAVE                  NOT NULL,
  id_employee CHAVE                  NOT NULL,
  id_tab      CHAVE                  NOT NULL,
  module      CHARACTER VARYING(255) NOT NULL,
  CONSTRAINT pk_tabmodulepreference PRIMARY KEY (id)
);