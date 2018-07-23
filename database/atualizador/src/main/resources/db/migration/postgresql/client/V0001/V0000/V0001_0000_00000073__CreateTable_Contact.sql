CREATE TABLE contact (
  id               CHAVE                  NOT NULL,
  email            CHARACTER VARYING(128) NOT NULL,
  customer_service BOOLEAN                NOT NULL,
  position         INTEGER                NOT NULL,
  CONSTRAINT pk_contact PRIMARY KEY (id)
);