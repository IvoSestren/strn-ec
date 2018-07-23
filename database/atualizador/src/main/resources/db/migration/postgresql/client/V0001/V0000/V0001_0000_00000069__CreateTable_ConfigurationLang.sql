CREATE TABLE configurationlang (
  id               CHAVE NOT NULL,
  id_configuration CHAVE NOT NULL,
  id_lang          CHAVE NOT NULL,
  value            TEXT,
  date_upd         TIMESTAMP WITH TIME ZONE,
  CONSTRAINT pk_configurationlang PRIMARY KEY (id)
);