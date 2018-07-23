CREATE TABLE imagelang (
  id       CHAVE NOT NULL,
  id_image CHAVE NOT NULL,
  id_lang  CHAVE NOT NULL,
  legend   CHARACTER VARYING(128),
  CONSTRAINT pk_imagelang PRIMARY KEY (id)
);