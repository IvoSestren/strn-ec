CREATE TABLE cmslang (
  id               CHAVE                  NOT NULL,
  id_cms           CHAVE                  NOT NULL,
  id_lang          CHAVE                  NOT NULL,
  id_shop          CHAVE                  NOT NULL,
  meta_title       CHARACTER VARYING(128) NOT NULL,
  meta_description CHARACTER VARYING(255),
  meta_keywords    CHARACTER VARYING(255),
  content          TEXT,
  link_rewrite     CHARACTER VARYING(128) NOT NULL,
  CONSTRAINT pk_cmslang PRIMARY KEY (id)
);