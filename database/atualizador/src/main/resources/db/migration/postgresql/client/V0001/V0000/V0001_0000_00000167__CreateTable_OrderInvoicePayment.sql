CREATE TABLE orderinvoicepayment (
  id               CHAVE NOT NULL,
  id_order_invoice CHAVE NOT NULL,
  id_order_payment CHAVE NOT NULL,
  id_order         CHAVE NOT NULL,
  CONSTRAINT pk_orderinvoicepayment PRIMARY KEY (id)
);