CREATE TABLE layeredindexablefeaturevaluelangvalue (
  id               CHAVE NOT NULL,
  id_feature_value CHAVE NOT NULL,
  id_lang          CHAVE NOT NULL,
  url_name         CHARACTER VARYING(128),
  meta_title       CHARACTER VARYING(128),
  CONSTRAINT pk_layeredindexablefeaturevaluelangvalue PRIMARY KEY (id)
);