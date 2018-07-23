CREATE TABLE advicelang (
  id        CHAVE NOT NULL,
  id_advice CHAVE NOT NULL,
  id_lang   CHAVE NOT NULL,
  html      TEXT,
  CONSTRAINT pk_advicelang PRIMARY KEY (id)
);