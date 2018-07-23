CREATE TABLE supplyorderhistory (
  id                 CHAVE                    NOT NULL,
  id_supply_order    CHAVE                    NOT NULL,
  id_employee        CHAVE                    NOT NULL,
  employee_lastname  CHARACTER VARYING(32),
  employee_firstname CHARACTER VARYING(32),
  id_state           CHAVE                    NOT NULL,
  date_add           TIMESTAMP WITH TIME ZONE NOT NULL,
  CONSTRAINT pk_supplyorderhistory PRIMARY KEY (id)
);