CREATE TABLE carriertaxrulesgroupshop (
  id                 CHAVE NOT NULL,
  id_carrier         CHAVE NOT NULL,
  id_tax_rules_group CHAVE NOT NULL,
  id_shop            CHAVE NOT NULL,
  CONSTRAINT pk_carriertaxrulesgroupshop PRIMARY KEY (id)
);