CREATE TABLE orderstate (
  id           CHAVE   NOT NULL,
  invoice      BOOLEAN,
  send_email   BOOLEAN,
  module_name  CHARACTER VARYING(255),
  color        CHARACTER VARYING(32),
  unremovable  BOOLEAN NOT NULL,
  hidden       BOOLEAN NOT NULL,
  logable      BOOLEAN NOT NULL,
  delivery     BOOLEAN NOT NULL,
  shipped      BOOLEAN NOT NULL,
  paid         BOOLEAN NOT NULL,
  pdf_invoice  BOOLEAN NOT NULL,
  pdf_delivery BOOLEAN NOT NULL,
  deleted      BOOLEAN NOT NULL,
  CONSTRAINT pk_orderstate PRIMARY KEY (id)
);