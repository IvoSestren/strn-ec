CREATE TABLE stockmvtreason (
  id       CHAVE                    NOT NULL,
  sign     BOOLEAN                  NOT NULL,
  date_add TIMESTAMP WITH TIME ZONE NOT NULL,
  date_upd TIMESTAMP WITH TIME ZONE NOT NULL,
  deleted  BOOLEAN                  NOT NULL,
  CONSTRAINT pk_stockmvtreason PRIMARY KEY (id)
);