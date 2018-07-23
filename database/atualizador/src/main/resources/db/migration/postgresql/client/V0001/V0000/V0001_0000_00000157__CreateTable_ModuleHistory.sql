CREATE TABLE modulehistory (
  id          CHAVE                    NOT NULL,
  id_employee CHAVE                    NOT NULL,
  id_module   CHAVE                    NOT NULL,
  date_add    TIMESTAMP WITH TIME ZONE NOT NULL,
  date_upd    TIMESTAMP WITH TIME ZONE NOT NULL,
  CONSTRAINT pk_modulehistory PRIMARY KEY (id)
);