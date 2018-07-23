CREATE TABLE orderdetailtax (
  id              CHAVE          NOT NULL,
  id_order_detail CHAVE          NOT NULL,
  id_tax          CHAVE          NOT NULL,
  unit_amount     DECIMAL(16, 6) NOT NULL,
  total_amount    DECIMAL(16, 6) NOT NULL,
  CONSTRAINT pk_orderdetailtax PRIMARY KEY (id)
);