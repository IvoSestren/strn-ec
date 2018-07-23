CREATE TABLE orderpayment (
  id              CHAVE                    NOT NULL,
  order_reference CHARACTER VARYING(9),
  id_currency     CHAVE                    NOT NULL,
  amount          DECIMAL(10, 2)           NOT NULL,
  payment_method  CHARACTER VARYING(255)   NOT NULL,
  conversion_rate DECIMAL(13, 6)           NOT NULL,
  transaction_id  CHARACTER VARYING(254),
  card_number     CHARACTER VARYING(254),
  card_brand      CHARACTER VARYING(254),
  card_expiration CHARACTER VARYING(7),
  card_holder     CHARACTER VARYING(254),
  date_add        TIMESTAMP WITH TIME ZONE NOT NULL,
  CONSTRAINT pk_orderpayment PRIMARY KEY (id)
);