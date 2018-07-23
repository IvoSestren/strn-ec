CREATE TABLE hook (
  id          chave                 NOT NULL,
  name        character varying(64) NOT NULL,
  title       character varying(64) NOT NULL,
  description text,
  position    integer               NOT NULL,
  CONSTRAINT pk_hook PRIMARY KEY (id)
);