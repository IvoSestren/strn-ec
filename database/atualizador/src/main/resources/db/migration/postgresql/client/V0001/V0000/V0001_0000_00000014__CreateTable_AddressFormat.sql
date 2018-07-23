CREATE TABLE addressformat (
  id         CHAVE                  NOT NULL,
  id_country CHAVE                  NOT NULL,
  format     CHARACTER VARYING(255) NOT NULL,
  CONSTRAINT pk_addressformat PRIMARY KEY (id)
);