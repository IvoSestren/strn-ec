CREATE TABLE attributegroup (
  id             CHAVE                  NOT NULL,
  is_color_group BOOLEAN                NOT NULL,
  group_type     CHARACTER VARYING(255) NOT NULL,
  position       INTEGER                NOT NULL,
  CONSTRAINT pk_attributegroup PRIMARY KEY (id)
);