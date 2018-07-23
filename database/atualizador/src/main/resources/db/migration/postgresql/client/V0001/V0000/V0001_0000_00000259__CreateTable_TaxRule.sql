CREATE TABLE taxrule (
  id                 CHAVE                  NOT NULL,
  id_tax_rules_group CHAVE                  NOT NULL,
  id_country         CHAVE                  NOT NULL,
  id_state           CHAVE                  NOT NULL,
  zipcode_from       CHARACTER VARYING(12)  NOT NULL,
  zipcode_to         CHARACTER VARYING(12)  NOT NULL,
  id_tax             CHAVE                  NOT NULL,
  behavior           INTEGER                NOT NULL,
  description        CHARACTER VARYING(100) NOT NULL,
  CONSTRAINT pk_taxrule PRIMARY KEY (id)
);