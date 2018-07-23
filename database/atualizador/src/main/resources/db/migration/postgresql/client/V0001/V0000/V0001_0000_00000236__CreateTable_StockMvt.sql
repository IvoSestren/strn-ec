CREATE TABLE stockmvt (
  id                  CHAVE                    NOT NULL,
  id_stock            CHAVE                    NOT NULL,
  id_order            CHAVE,
  id_supply_order     CHAVE,
  id_stock_mvt_reason CHAVE                    NOT NULL,
  id_employee         CHAVE                    NOT NULL,
  employee_lastname   CHARACTER VARYING(32),
  employee_firstname  CHARACTER VARYING(32),
  physical_quantity   INTEGER                  NOT NULL,
  date_add            TIMESTAMP WITH TIME ZONE NOT NULL,
  sign                INTEGER                  NOT NULL,
  price_te            DECIMAL(20, 6),
  last_wa             DECIMAL(20, 6),
  current_wa          DECIMAL(20, 6),
  referer             INTEGER,
  CONSTRAINT pk_stockmvt PRIMARY KEY (id)
);