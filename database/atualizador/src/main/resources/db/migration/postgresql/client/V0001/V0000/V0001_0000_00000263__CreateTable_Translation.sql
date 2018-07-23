CREATE TABLE translation (
  id          CHAVE                 NOT NULL,
  id_lang     CHAVE                 NOT NULL,
  key         TEXT                  NOT NULL,
  translation TEXT                  NOT NULL,
  domain      CHARACTER VARYING(80) NOT NULL,
  theme       CHARACTER VARYING(32),
  CONSTRAINT pk_translation PRIMARY KEY (id)
);