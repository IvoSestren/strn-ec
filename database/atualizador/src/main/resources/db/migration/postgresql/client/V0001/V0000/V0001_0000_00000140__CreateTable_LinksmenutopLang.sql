CREATE TABLE linksmenutoplang (
  id              CHAVE                  NOT NULL,
  id_linksmenutop CHAVE                  NOT NULL,
  id_lang         CHAVE                  NOT NULL,
  id_shop         CHAVE                  NOT NULL,
  label           CHARACTER VARYING(128) NOT NULL,
  link            CHARACTER VARYING(128) NOT NULL,
  CONSTRAINT pk_linksmenutoplang PRIMARY KEY (id)
);