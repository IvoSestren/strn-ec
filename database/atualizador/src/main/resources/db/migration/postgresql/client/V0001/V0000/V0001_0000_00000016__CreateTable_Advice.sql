CREATE TABLE advice (
  id           CHAVE                  NOT NULL,
  id_ps_advice CHAVE                  NOT NULL,
  id_tab       CHAVE                  NOT NULL,
  ids_tab      TEXT,
  validated    BOOLEAN                NOT NULL,
  hide         BOOLEAN                NOT NULL,
  location     CHARACTER VARYING(255) NOT NULL,
  selector     CHARACTER VARYING(255),
  start_day    INTEGER                NOT NULL,
  stop_day     INTEGER                NOT NULL,
  weight       INTEGER,
  CONSTRAINT pk_advice PRIMARY KEY (id)
);