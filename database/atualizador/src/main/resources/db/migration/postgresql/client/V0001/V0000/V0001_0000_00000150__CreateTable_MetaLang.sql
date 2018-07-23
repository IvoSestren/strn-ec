CREATE TABLE metalang (
  id          CHAVE                  NOT NULL,
  id_meta     CHAVE                  NOT NULL,
  id_shop     CHAVE                  NOT NULL,
  id_lang     CHAVE                  NOT NULL,
  title       CHARACTER VARYING(128),
  description CHARACTER VARYING(255),
  keywords    CHARACTER VARYING(255),
  url_rewrite CHARACTER VARYING(255) NOT NULL,
  CONSTRAINT pk_metalang PRIMARY KEY (id)
);