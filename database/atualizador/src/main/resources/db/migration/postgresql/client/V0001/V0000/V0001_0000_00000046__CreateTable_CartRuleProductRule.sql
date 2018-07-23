CREATE TABLE cartruleproductrule (
  id                    CHAVE                  NOT NULL,
  id_product_rule       CHAVE                  NOT NULL,
  id_product_rule_group CHAVE                  NOT NULL,
  type                  CHARACTER VARYING(255) NOT NULL,
  CONSTRAINT pk_cartruleproductrule PRIMARY KEY (id)
);