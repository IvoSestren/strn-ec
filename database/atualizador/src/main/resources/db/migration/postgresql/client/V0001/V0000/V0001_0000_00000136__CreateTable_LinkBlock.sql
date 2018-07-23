CREATE TABLE linkblock (
  id       CHAVE NOT NULL,
  id_hook  CHAVE,
  position CHAVE NOT NULL,
  content  TEXT,
  CONSTRAINT pk_linkblock PRIMARY KEY (id)
);