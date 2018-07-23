CREATE TABLE productattachment (
  id            CHAVE NOT NULL,
  id_product    CHAVE NOT NULL,
  id_attachment CHAVE NOT NULL,
  CONSTRAINT pk_productattachment PRIMARY KEY (id)
);