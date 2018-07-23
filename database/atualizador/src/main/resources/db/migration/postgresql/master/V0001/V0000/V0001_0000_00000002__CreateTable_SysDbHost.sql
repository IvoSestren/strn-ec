CREATE TABLE sysdbhost (
  id     chave                 NOT NULL,
  host   CHARACTER VARYING(50) NOT NULL,
  active BOOLEAN               NOT NULL,
  CONSTRAINT pk_sysdbhost PRIMARY KEY (id)
);