CREATE TABLE referrershop (
  id                  CHAVE NOT NULL,
  id_referrer         CHAVE NOT NULL,
  id_shop             CHAVE NOT NULL,
  cache_visitors      INTEGER,
  cache_visits        INTEGER,
  cache_pages         INTEGER,
  cache_registrations INTEGER,
  cache_orders        INTEGER,
  cache_sales         DECIMAL(17, 2),
  cache_reg_rate      DECIMAL(5, 4),
  cache_order_rate    DECIMAL(5, 4),
  CONSTRAINT pk_referrershop PRIMARY KEY (id)
);