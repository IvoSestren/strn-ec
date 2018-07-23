CREATE TABLE productlang (
  id                 chave                  NOT NULL,
  id_product         chave                  NOT NULL,
  id_shop            chave                  NOT NULL,
  id_lang            chave                  NOT NULL,
  description        text,
  description_short  text,
  link_rewrite       character varying(128) NOT NULL,
  meta_description   character varying(255),
  meta_keywords      character varying(255),
  meta_title         character varying(128),
  name               character varying(128) NOT NULL,
  available_now      character varying(255),
  available_later    character varying(255),
  delivery_in_stock  character varying(255),
  delivery_out_stock character varying(255),
  CONSTRAINT pk_productlang PRIMARY KEY (id)
);