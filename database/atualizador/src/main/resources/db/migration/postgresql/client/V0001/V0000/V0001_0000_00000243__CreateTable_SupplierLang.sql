CREATE TABLE supplierlang (
  id               CHAVE NOT NULL,
  id_supplier      CHAVE NOT NULL,
  id_lang          CHAVE NOT NULL,
  description      TEXT,
  meta_title       CHARACTER VARYING(128),
  meta_keywords    CHARACTER VARYING(255),
  meta_description CHARACTER VARYING(255),
  CONSTRAINT pk_supplierlang PRIMARY KEY (id)
);