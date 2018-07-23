CREATE TABLE attachmentlang (
  id            CHAVE NOT NULL,
  id_attachment CHAVE NOT NULL,
  id_lang       CHAVE NOT NULL,
  name          CHARACTER VARYING(32),
  description   TEXT,
  CONSTRAINT pk_attachmentlang PRIMARY KEY (id)
);