CREATE TABLE log (
  id          CHAVE                    NOT NULL,
  severity    INTEGER                  NOT NULL,
  error_code  INTEGER,
  message     TEXT                     NOT NULL,
  object_type CHARACTER VARYING(32),
  object_id   CHAVE,
  id_employee CHAVE,
  date_add    TIMESTAMP WITH TIME ZONE NOT NULL,
  date_upd    TIMESTAMP WITH TIME ZONE NOT NULL,
  CONSTRAINT pk_log PRIMARY KEY (id)
);