CREATE TABLE pageviewed (
  id            CHAVE   NOT NULL,
  id_page       CHAVE   NOT NULL,
  id_shop_group CHAVE   NOT NULL,
  id_shop       CHAVE   NOT NULL,
  id_date_range CHAVE   NOT NULL,
  counter       INTEGER NOT NULL,
  CONSTRAINT pk_pageviewed PRIMARY KEY (id)
);