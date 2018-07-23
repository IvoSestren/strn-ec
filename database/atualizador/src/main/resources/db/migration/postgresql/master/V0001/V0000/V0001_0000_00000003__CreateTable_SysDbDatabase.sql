CREATE TABLE sysdbdatabase (
  id           chave                 NOT NULL,
  database     CHARACTER VARYING(50) NOT NULL,
  id_sysdbhost chave                 NOT NULL,
  active       BOOLEAN               NOT NULL,
  CONSTRAINT pk_sysdbdatabase PRIMARY KEY (id),
  CONSTRAINT fk_sysdbdatabase_sysdbhost FOREIGN KEY (id_sysdbhost) REFERENCES sysdbhost (id)
);