CREATE TABLE attribute (
  id                 CHAVE                 NOT NULL,
  id_attribute_group CHAVE                 NOT NULL,
  color              CHARACTER VARYING(32) NOT NULL,
  position           INTEGER               NOT NULL,
  CONSTRAINT pk_attribute PRIMARY KEY (id)
);