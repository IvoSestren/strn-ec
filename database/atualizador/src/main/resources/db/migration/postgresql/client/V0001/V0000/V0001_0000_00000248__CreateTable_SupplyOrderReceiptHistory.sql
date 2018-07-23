CREATE TABLE supplyorderreceipthistory (
  id                     CHAVE                    NOT NULL,
  id_supply_order_detail CHAVE                    NOT NULL,
  id_employee            CHAVE                    NOT NULL,
  employee_lastname      CHARACTER VARYING(32),
  employee_firstname     CHARACTER VARYING(32),
  id_supply_order_state  CHAVE                    NOT NULL,
  quantity               CHAVE                    NOT NULL,
  date_add               TIMESTAMP WITH TIME ZONE NOT NULL,
  CONSTRAINT pk_supplyorderreceipthistory PRIMARY KEY (id)
);