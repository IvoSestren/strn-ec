CREATE TABLE webserviceaccount (
  id          CHAVE                 NOT NULL,
  key         CHARACTER VARYING(32) NOT NULL,
  description TEXT,
  class_name  CHARACTER VARYING(50) NOT NULL,
  is_module   BOOLEAN               NOT NULL,
  module_name CHARACTER VARYING(50),
  active      BOOLEAN               NOT NULL,
  CONSTRAINT pk_webserviceaccount PRIMARY KEY (id)
);