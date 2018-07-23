CREATE TABLE stockmvtreasonlang (
  id                  CHAVE                  NOT NULL,
  id_stock_mvt_reason CHAVE                  NOT NULL,
  id_lang             CHAVE                  NOT NULL,
  name                CHARACTER VARYING(255) NOT NULL,
  CONSTRAINT pk_stockmvtreasonlang PRIMARY KEY (id)
);