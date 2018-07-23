CREATE TABLE ordercartrule (
  id               CHAVE                  NOT NULL,
  id_order         CHAVE                  NOT NULL,
  id_cart_rule     CHAVE                  NOT NULL,
  id_order_invoice CHAVE,
  name             CHARACTER VARYING(254) NOT NULL,
  value            DECIMAL(17, 2)         NOT NULL,
  value_tax_excl   DECIMAL(17, 2)         NOT NULL,
  free_shipping    BOOLEAN                NOT NULL,
  CONSTRAINT pk_ordercartrule PRIMARY KEY (id)
);