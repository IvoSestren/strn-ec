CREATE TABLE manufacturerlang (
  id                CHAVE NOT NULL,
  id_manufacturer   CHAVE NOT NULL,
  id_lang           CHAVE NOT NULL,
  description       TEXT,
  short_description TEXT,
  meta_title        CHARACTER VARYING(128),
  meta_keywords     CHARACTER VARYING(255),
  meta_description  CHARACTER VARYING(255),
  CONSTRAINT pk_manufacturerlang PRIMARY KEY (id)
);