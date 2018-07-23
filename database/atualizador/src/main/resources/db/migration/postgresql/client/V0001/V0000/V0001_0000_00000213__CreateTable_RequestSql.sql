CREATE TABLE requestsql (
  id   CHAVE                  NOT NULL,
  name CHARACTER VARYING(200) NOT NULL,
  sql  TEXT                   NOT NULL,
  CONSTRAINT pk_requestsql PRIMARY KEY (id)
);