CREATE TABLE orderstatelang (
  id             CHAVE                 NOT NULL,
  id_order_state CHAVE                 NOT NULL,
  id_lang        CHAVE                 NOT NULL,
  name           CHARACTER VARYING(64) NOT NULL,
  template       CHARACTER VARYING(64) NOT NULL,
  CONSTRAINT pk_orderstatelang PRIMARY KEY (id)
);