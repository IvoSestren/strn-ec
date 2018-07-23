CREATE TABLE specificpricerule (
  id             CHAVE                    NOT NULL,
  name           CHARACTER VARYING(255)   NOT NULL,
  id_shop        CHAVE                    NOT NULL,
  id_currency    CHAVE                    NOT NULL,
  id_country     CHAVE                    NOT NULL,
  id_group       CHAVE                    NOT NULL,
  from_quantity  INTEGER                  NOT NULL,
  price          DECIMAL(20, 6),
  reduction      DECIMAL(20, 6)           NOT NULL,
  reduction_tax  BOOLEAN                  NOT NULL,
  reduction_type CHARACTER VARYING(255)   NOT NULL,
  "from"         TIMESTAMP WITH TIME ZONE NOT NULL,
  "to"           TIMESTAMP WITH TIME ZONE NOT NULL,
  CONSTRAINT pk_specificpricerule PRIMARY KEY (id)
);