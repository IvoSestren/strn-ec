CREATE TABLE smartylastflush (
  id         CHAVE                    NOT NULL,
  type       CHARACTER VARYING(255)   NOT NULL,
  last_flush TIMESTAMP WITH TIME ZONE NOT NULL,
  CONSTRAINT pk_smartylastflush PRIMARY KEY (id)
);