CREATE TABLE importmatch (
  id    CHAVE                 NOT NULL,
  name  CHARACTER VARYING(32) NOT NULL,
  match TEXT                  NOT NULL,
  skip  BOOLEAN               NOT NULL,
  CONSTRAINT pk_importmatch PRIMARY KEY (id)
);