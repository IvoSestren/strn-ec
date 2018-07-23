CREATE TABLE shopgroup (
  id             CHAVE                 NOT NULL,
  name           CHARACTER VARYING(64) NOT NULL,
  share_customer BOOLEAN               NOT NULL,
  share_order    BOOLEAN               NOT NULL,
  share_stock    BOOLEAN               NOT NULL,
  active         BOOLEAN               NOT NULL,
  deleted        BOOLEAN               NOT NULL,
  CONSTRAINT pk_shopgroup PRIMARY KEY (id)
);