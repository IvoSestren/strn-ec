CREATE TABLE orderslipdetailtax (
  id                   CHAVE          NOT NULL,
  id_order_slip_detail CHAVE          NOT NULL,
  id_tax               CHAVE          NOT NULL,
  unit_amount          DECIMAL(16, 6) NOT NULL,
  total_amount         DECIMAL(16, 6) NOT NULL,
  CONSTRAINT pk_orderslipdetailtax PRIMARY KEY (id)
);