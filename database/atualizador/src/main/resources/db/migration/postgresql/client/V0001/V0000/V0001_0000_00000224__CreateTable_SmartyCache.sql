CREATE TABLE smartycache (
  id       CHAVE                    NOT NULL,
  name     CHARACTER VARYING(40)    NOT NULL,
  cache_id CHARACTER VARYING(254),
  modified TIMESTAMP WITH TIME ZONE NOT NULL,
  content  TEXT                     NOT NULL,
  CONSTRAINT pk_smartycache PRIMARY KEY (id)
);