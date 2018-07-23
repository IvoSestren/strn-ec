CREATE TABLE smartylazycache (
  id            CHAVE                    NOT NULL,
  template_hash CHARACTER VARYING(32)    NOT NULL,
  cache_id      CHARACTER VARYING(255)   NOT NULL,
  compile_id    CHARACTER VARYING(32)    NOT NULL,
  filepath      CHARACTER VARYING(255)   NOT NULL,
  last_update   TIMESTAMP WITH TIME ZONE NOT NULL,
  CONSTRAINT pk_smartylazycache PRIMARY KEY (id)
);