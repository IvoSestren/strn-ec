CREATE TABLE taxrulesgroup (
  id       CHAVE                    NOT NULL,
  name     CHARACTER VARYING(50)    NOT NULL,
  active   BOOLEAN                  NOT NULL,
  deleted  BOOLEAN                  NOT NULL,
  date_add TIMESTAMP WITH TIME ZONE NOT NULL,
  date_upd TIMESTAMP WITH TIME ZONE NOT NULL,
  CONSTRAINT pk_taxrulesgroup PRIMARY KEY (id)
);