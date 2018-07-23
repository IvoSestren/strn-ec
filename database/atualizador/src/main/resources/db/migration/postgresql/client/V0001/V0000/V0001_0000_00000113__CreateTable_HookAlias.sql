CREATE TABLE hookalias (
  id    CHAVE                 NOT NULL,
  alias CHARACTER VARYING(64) NOT NULL,
  name  CHARACTER VARYING(64) NOT NULL,
  CONSTRAINT pk_hookalias PRIMARY KEY (id)
);