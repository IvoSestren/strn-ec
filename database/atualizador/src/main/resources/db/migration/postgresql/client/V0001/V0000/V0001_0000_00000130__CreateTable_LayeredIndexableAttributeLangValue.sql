CREATE TABLE layeredindexableattributelangvalue (
  id           CHAVE NOT NULL,
  id_attribute CHAVE NOT NULL,
  id_lang      CHAVE NOT NULL,
  url_name     CHARACTER VARYING(128),
  meta_title   CHARACTER VARYING(128),
  CONSTRAINT pk_layeredindexableattributelangvalue PRIMARY KEY (id)
);