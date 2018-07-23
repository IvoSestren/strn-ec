CREATE TABLE alias (
  id     CHAVE                  NOT NULL,
  alias  CHARACTER VARYING(255) NOT NULL,
  search CHARACTER VARYING(255) NOT NULL,
  active BOOLEAN                NOT NULL,
  CONSTRAINT pk_alias PRIMARY KEY (id)
);