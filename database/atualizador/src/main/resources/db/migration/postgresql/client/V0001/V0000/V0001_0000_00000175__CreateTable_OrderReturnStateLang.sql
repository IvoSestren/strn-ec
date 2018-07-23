CREATE TABLE orderreturnstatelang (
  id                    CHAVE                 NOT NULL,
  id_order_return_state CHAVE                 NOT NULL,
  id_lang               CHAVE                 NOT NULL,
  name                  CHARACTER VARYING(64) NOT NULL,
  CONSTRAINT pk_orderreturnstatelang PRIMARY KEY (id)
);