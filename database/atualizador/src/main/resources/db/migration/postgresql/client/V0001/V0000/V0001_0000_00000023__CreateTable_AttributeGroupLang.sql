CREATE TABLE attributegrouplang (
  id                 CHAVE                  NOT NULL,
  id_attribute_group CHAVE                  NOT NULL,
  id_lang            CHAVE                  NOT NULL,
  name               CHARACTER VARYING(128) NOT NULL,
  public_name        CHARACTER VARYING(64)  NOT NULL,
  CONSTRAINT pk_attributegrouplang PRIMARY KEY (id)
);