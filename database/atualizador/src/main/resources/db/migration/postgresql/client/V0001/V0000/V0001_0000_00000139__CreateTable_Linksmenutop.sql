CREATE TABLE linksmenutop (
  id         CHAVE   NOT NULL,
  id_shop    CHAVE   NOT NULL,
  new_window BOOLEAN NOT NULL,
  CONSTRAINT pk_linksmenutop PRIMARY KEY (id)
);