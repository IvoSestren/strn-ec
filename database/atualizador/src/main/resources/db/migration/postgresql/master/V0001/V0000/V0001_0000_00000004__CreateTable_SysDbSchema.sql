CREATE TABLE sysdbschema (
  id               chave                 NOT NULL,
  schema           CHARACTER VARYING(50) NOT NULL,
  id_sysdbdatabase chave,
  active           BOOLEAN               NOT NULL,
  CONSTRAINT pk_sysdbschema PRIMARY KEY (id),
  CONSTRAINT fk_sysdbschema_sysdbdatabase FOREIGN KEY (id_sysdbdatabase) REFERENCES sysdbdatabase (id)
);