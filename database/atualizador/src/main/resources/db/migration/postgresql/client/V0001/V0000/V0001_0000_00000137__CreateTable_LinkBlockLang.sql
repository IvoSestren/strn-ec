CREATE TABLE linkblocklang (
  id             CHAVE                 NOT NULL,
  id_link_block  CHAVE                 NOT NULL,
  id_lang        CHAVE                 NOT NULL,
  name           CHARACTER VARYING(40) NOT NULL,
  custom_content TEXT,
  CONSTRAINT pk_linkblocklang PRIMARY KEY (id)
);