CREATE TABLE sysurl (
  id             CHAVE                  NOT NULL,
  id_syscontract CHAVE                  NOT NULL,
  url            CHARACTER VARYING(250) NOT NULL,
  id_sysdbschema CHAVE                  NOT NULL,
  active         BOOLEAN                NOT NULL,
  id_shop        CHAVE                  NOT NULL,
  CONSTRAINT pk_sysurl PRIMARY KEY (id),
  CONSTRAINT fk_sysurl_syscontract FOREIGN KEY (id_syscontract) REFERENCES syscontract (id),
  CONSTRAINT fk_sysurl_sysdbschema FOREIGN KEY (id_sysdbschema) REFERENCES sysdbschema (id)
);