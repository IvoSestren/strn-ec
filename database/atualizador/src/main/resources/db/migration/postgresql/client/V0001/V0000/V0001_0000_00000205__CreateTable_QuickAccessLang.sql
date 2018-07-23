CREATE TABLE quickaccesslang (
  id              CHAVE                 NOT NULL,
  id_quick_access CHAVE                 NOT NULL,
  id_lang         CHAVE                 NOT NULL,
  name            CHARACTER VARYING(32) NOT NULL,
  CONSTRAINT pk_quickaccesslang PRIMARY KEY (id)
);