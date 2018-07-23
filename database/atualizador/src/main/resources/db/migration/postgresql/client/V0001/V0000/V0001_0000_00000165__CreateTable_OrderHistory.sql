CREATE TABLE orderhistory (
  id             CHAVE                    NOT NULL,
  id_employee    CHAVE                    NOT NULL,
  id_order       CHAVE                    NOT NULL,
  id_order_state CHAVE                    NOT NULL,
  date_add       TIMESTAMP WITH TIME ZONE NOT NULL,
  CONSTRAINT pk_orderhistory PRIMARY KEY (id)
);