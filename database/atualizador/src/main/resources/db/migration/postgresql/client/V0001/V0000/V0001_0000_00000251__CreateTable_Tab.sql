CREATE TABLE tab (
  id             CHAVE   NOT NULL,
  id_parent      CHAVE   NOT NULL,
  position       INTEGER NOT NULL,
  module         CHARACTER VARYING(64),
  class_name     CHARACTER VARYING(64),
  active         BOOLEAN NOT NULL,
  hide_host_mode BOOLEAN NOT NULL,
  icon           CHARACTER VARYING(32),
  CONSTRAINT pk_tab PRIMARY KEY (id)
);