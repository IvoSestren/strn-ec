CREATE TABLE orderslipdetail (
  id                   CHAVE NOT NULL,
  id_order_slip        CHAVE NOT NULL,
  id_order_detail      CHAVE NOT NULL,
  product_quantity     CHAVE NOT NULL,
  unit_price_tax_excl  DECIMAL(20, 6),
  unit_price_tax_incl  DECIMAL(20, 6),
  total_price_tax_excl DECIMAL(20, 6),
  total_price_tax_incl DECIMAL(20, 6),
  amount_tax_excl      DECIMAL(20, 6),
  amount_tax_incl      DECIMAL(20, 6),
  CONSTRAINT pk_orderslipdetail PRIMARY KEY (id)
);