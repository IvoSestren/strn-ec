CREATE TABLE specificpricerulecondition (
  id                                     CHAVE                  NOT NULL,
  id_specific_price_rule_condition_group CHAVE                  NOT NULL,
  type                                   CHARACTER VARYING(255) NOT NULL,
  value                                  CHARACTER VARYING(255) NOT NULL,
  CONSTRAINT pk_specificpricerulecondition PRIMARY KEY (id)
);