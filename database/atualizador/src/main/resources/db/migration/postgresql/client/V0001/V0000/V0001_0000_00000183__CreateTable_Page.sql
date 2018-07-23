CREATE TABLE page (
  id           CHAVE NOT NULL,
  id_page_type CHAVE NOT NULL,
  id_object    CHAVE,
  CONSTRAINT pk_page PRIMARY KEY (id)
);