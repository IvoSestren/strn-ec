CREATE TABLE quickaccess (
  id         CHAVE                  NOT NULL,
  new_window BOOLEAN                NOT NULL,
  link       CHARACTER VARYING(255) NOT NULL,
  CONSTRAINT pk_quickaccess PRIMARY KEY (id)
);