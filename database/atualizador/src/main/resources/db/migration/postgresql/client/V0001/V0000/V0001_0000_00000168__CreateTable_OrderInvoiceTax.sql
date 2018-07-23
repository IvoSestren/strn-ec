CREATE TABLE orderinvoicetax (
  id               CHAVE                 NOT NULL,
  id_order_invoice CHAVE                 NOT NULL,
  type             CHARACTER VARYING(15) NOT NULL,
  id_tax           CHAVE                 NOT NULL,
  amount           DECIMAL(10, 6)        NOT NULL,
  CONSTRAINT pk_orderinvoicetax PRIMARY KEY (id)
);