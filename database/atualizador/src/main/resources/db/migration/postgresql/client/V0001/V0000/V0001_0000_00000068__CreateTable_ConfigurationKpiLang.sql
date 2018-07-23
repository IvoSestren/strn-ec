CREATE TABLE configurationkpilang (
  id                   CHAVE NOT NULL,
  id_configuration_kpi CHAVE NOT NULL,
  id_lang              CHAVE NOT NULL,
  value                TEXT,
  date_upd             TIMESTAMP WITH TIME ZONE,
  CONSTRAINT pk_configurationkpilang PRIMARY KEY (id)
);