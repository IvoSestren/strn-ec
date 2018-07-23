CREATE TABLE storelang (
  id       CHAVE                  NOT NULL,
  id_store CHAVE                  NOT NULL,
  id_lang  CHAVE                  NOT NULL,
  name     CHARACTER VARYING(255) NOT NULL,
  address1 CHARACTER VARYING(255) NOT NULL,
  address2 CHARACTER VARYING(255),
  hours    TEXT,
  note     TEXT,
  CONSTRAINT pk_storelang PRIMARY KEY (id)
);