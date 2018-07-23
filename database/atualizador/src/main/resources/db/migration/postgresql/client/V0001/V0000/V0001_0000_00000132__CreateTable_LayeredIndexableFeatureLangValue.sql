CREATE TABLE layeredindexablefeaturelangvalue (
  id         CHAVE                  NOT NULL,
  id_feature CHAVE                  NOT NULL,
  id_lang    CHAVE                  NOT NULL,
  url_name   CHARACTER VARYING(128) NOT NULL,
  meta_title CHARACTER VARYING(128),
  CONSTRAINT pk_layeredindexablefeaturelangvalue PRIMARY KEY (id)
);