CREATE TABLE requiredfield (
  id          CHAVE                 NOT NULL,
  object_name CHARACTER VARYING(32) NOT NULL,
  field_name  CHARACTER VARYING(32) NOT NULL,
  CONSTRAINT pk_requiredfield PRIMARY KEY (id)
);