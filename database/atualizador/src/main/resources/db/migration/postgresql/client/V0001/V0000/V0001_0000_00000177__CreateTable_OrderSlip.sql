CREATE TABLE orderslip (
  id                      CHAVE                    NOT NULL,
  conversion_rate         DECIMAL(13, 6)           NOT NULL,
  id_customer             CHAVE                    NOT NULL,
  id_order                CHAVE                    NOT NULL,
  total_products_tax_excl DECIMAL(20, 6),
  total_products_tax_incl DECIMAL(20, 6),
  total_shipping_tax_excl DECIMAL(20, 6),
  total_shipping_tax_incl DECIMAL(20, 6),
  shipping_cost           BOOLEAN                  NOT NULL,
  amount                  DECIMAL(10, 2)           NOT NULL,
  shipping_cost_amount    DECIMAL(10, 2)           NOT NULL,
  partial                 BOOLEAN                  NOT NULL,
  order_slip_type         BOOLEAN                  NOT NULL,
  date_add                TIMESTAMP WITH TIME ZONE NOT NULL,
  date_upd                TIMESTAMP WITH TIME ZONE NOT NULL,
  CONSTRAINT pk_orderslip PRIMARY KEY (id)
);