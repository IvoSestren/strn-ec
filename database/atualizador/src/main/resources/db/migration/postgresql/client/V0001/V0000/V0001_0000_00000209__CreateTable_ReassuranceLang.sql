CREATE TABLE reassurancelang (
  id             CHAVE                  NOT NULL,
  id_reassurance CHAVE                  NOT NULL,
  id_lang        CHAVE                  NOT NULL,
  text           CHARACTER VARYING(300) NOT NULL,
  CONSTRAINT pk_reassurancelang PRIMARY KEY (id)
);