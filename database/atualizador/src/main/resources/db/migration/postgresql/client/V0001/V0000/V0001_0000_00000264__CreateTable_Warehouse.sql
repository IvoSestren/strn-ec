CREATE TABLE warehouse (
  id              CHAVE                  NOT NULL,
  id_currency     CHAVE                  NOT NULL,
  id_address      CHAVE                  NOT NULL,
  id_employee     CHAVE                  NOT NULL,
  reference       CHARACTER VARYING(32),
  name            CHARACTER VARYING(45)  NOT NULL,
  management_type CHARACTER VARYING(255) NOT NULL,
  deleted         BOOLEAN                NOT NULL,
  CONSTRAINT pk_warehouse PRIMARY KEY (id)
);