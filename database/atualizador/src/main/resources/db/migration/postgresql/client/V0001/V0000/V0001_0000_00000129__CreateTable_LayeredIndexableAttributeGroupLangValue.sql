CREATE TABLE layeredindexableattributegrouplangvalue (
  id                 CHAVE NOT NULL,
  id_attribute_group CHAVE NOT NULL,
  id_lang            CHAVE NOT NULL,
  url_name           CHARACTER VARYING(128),
  meta_title         CHARACTER VARYING(128),
  CONSTRAINT pk_layeredindexableattributegrouplangvalue PRIMARY KEY (id)
);