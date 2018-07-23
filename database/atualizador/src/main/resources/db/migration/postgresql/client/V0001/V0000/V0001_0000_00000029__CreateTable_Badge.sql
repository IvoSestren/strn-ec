CREATE TABLE badge (
  id             CHAVE                 NOT NULL,
  id_ps_badge    CHAVE                 NOT NULL,
  type           CHARACTER VARYING(32) NOT NULL,
  id_group       CHAVE                 NOT NULL,
  group_position INTEGER               NOT NULL,
  scoring        INTEGER               NOT NULL,
  awb            INTEGER,
  validated      BOOLEAN               NOT NULL,
  CONSTRAINT pk_badge PRIMARY KEY (id)
);