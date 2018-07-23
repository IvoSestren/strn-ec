CREATE TABLE cmscategorylang (
  id               CHAVE                  NOT NULL,
  id_cms_category  CHAVE                  NOT NULL,
  id_lang          CHAVE                  NOT NULL,
  id_shop          CHAVE                  NOT NULL,
  name             CHARACTER VARYING(128) NOT NULL,
  description      TEXT,
  link_rewrite     CHARACTER VARYING(128) NOT NULL,
  meta_title       CHARACTER VARYING(128),
  meta_keywords    CHARACTER VARYING(255),
  meta_description CHARACTER VARYING(255),
  CONSTRAINT pk_cmscategorylang PRIMARY KEY (id)
);