CREATE TABLE supplier (
  id       CHAVE                    NOT NULL,
  name     CHARACTER VARYING(64)    NOT NULL,
  date_add TIMESTAMP WITH TIME ZONE NOT NULL,
  date_upd TIMESTAMP WITH TIME ZONE NOT NULL,
  active   BOOLEAN                  NOT NULL,
  CONSTRAINT pk_supplier PRIMARY KEY (id)
);