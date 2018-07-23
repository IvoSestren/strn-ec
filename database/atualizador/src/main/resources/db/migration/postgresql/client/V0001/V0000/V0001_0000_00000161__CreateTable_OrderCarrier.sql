CREATE TABLE ordercarrier (
  id                     CHAVE                    NOT NULL,
  id_order               CHAVE                    NOT NULL,
  id_carrier             CHAVE                    NOT NULL,
  id_order_invoice       CHAVE,
  weight                 DECIMAL(20, 6),
  shipping_cost_tax_excl DECIMAL(20, 6),
  shipping_cost_tax_incl DECIMAL(20, 6),
  tracking_number        CHARACTER VARYING(64),
  date_add               TIMESTAMP WITH TIME ZONE NOT NULL,
  CONSTRAINT pk_ordercarrier PRIMARY KEY (id)
);