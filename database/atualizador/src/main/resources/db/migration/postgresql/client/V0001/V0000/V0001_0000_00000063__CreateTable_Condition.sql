CREATE TABLE condition (
  id                 CHAVE                    NOT NULL,
  id_ps_condition    CHAVE                    NOT NULL,
  type               CHARACTER VARYING(255)   NOT NULL,
  request            TEXT,
  operator           CHARACTER VARYING(32),
  value              CHARACTER VARYING(64),
  result             CHARACTER VARYING(64),
  calculation_type   CHARACTER VARYING(255),
  calculation_detail VARCHAR(64),
  validated          BOOLEAN                  NOT NULL,
  date_add           TIMESTAMP WITH TIME ZONE NOT NULL,
  date_upd           TIMESTAMP WITH TIME ZONE NOT NULL,
  CONSTRAINT pk_condition PRIMARY KEY (id)
);